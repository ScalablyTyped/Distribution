package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsp {
  
  @JSImport("@happyguestmx/web-utilities", "fsp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@happyguestmx/web-utilities", "fsp.FSP")
  @js.native
  def FSP: FSPConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@happyguestmx/web-utilities", "fsp.FSP")
  @js.native
  open class FSPCls protected ()
    extends StObject
       with FSP_ {
    def this(fullData: js.Array[Any], filterColums: js.Array[Any], filter: Boolean, sort: Boolean) = this()
  }
  
  inline def FSP_=(x: FSPConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FSP")(x.asInstanceOf[js.Any])
}
