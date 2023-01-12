package typings.interactjsTypes.anon

import typings.interactjsTypes.coreScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Install extends StObject {
  
  var id: String
  
  def install(scope: Scope): Unit
}
object Install {
  
  inline def apply(id: String, install: Scope => Unit): Install = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], install = js.Any.fromFunction1(install))
    __obj.asInstanceOf[Install]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Install] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstall(value: Scope => Unit): Self = StObject.set(x, "install", js.Any.fromFunction1(value))
  }
}
