package typings.localforage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// duplicating LocalForageDriverMethodsOptional to preserve TS v2.0 support,
// since Partial<> isn't supported there
trait LocalForageDbMethodsOptional extends StObject {
  
  def dropInstance(): js.Promise[Unit]
  def dropInstance(dbInstanceOptions: Unit, callback: js.Function1[/* err */ Any, Unit]): js.Promise[Unit]
  def dropInstance(dbInstanceOptions: LocalForageDbInstanceOptions): js.Promise[Unit]
  def dropInstance(dbInstanceOptions: LocalForageDbInstanceOptions, callback: js.Function1[/* err */ Any, Unit]): js.Promise[Unit]
  @JSName("dropInstance")
  var dropInstance_Original: LocalForageDropInstanceFn
}
object LocalForageDbMethodsOptional {
  
  inline def apply(
    dropInstance: (/* dbInstanceOptions */ js.UndefOr[LocalForageDbInstanceOptions], /* callback */ js.UndefOr[js.Function1[/* err */ Any, Unit]]) => js.Promise[Unit]
  ): LocalForageDbMethodsOptional = {
    val __obj = js.Dynamic.literal(dropInstance = js.Any.fromFunction2(dropInstance))
    __obj.asInstanceOf[LocalForageDbMethodsOptional]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalForageDbMethodsOptional] (val x: Self) extends AnyVal {
    
    inline def setDropInstance(
      value: (/* dbInstanceOptions */ js.UndefOr[LocalForageDbInstanceOptions], /* callback */ js.UndefOr[js.Function1[/* err */ Any, Unit]]) => js.Promise[Unit]
    ): Self = StObject.set(x, "dropInstance", js.Any.fromFunction2(value))
  }
}
