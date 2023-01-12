package typings.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/Pagination/Pagination.PaginationClassKey>> */
trait PartialClassNameMapPagina extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
  
  var ul: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapPagina {
  
  inline def apply(): PartialClassNameMapPagina = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapPagina]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassNameMapPagina] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setUl(value: String): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
    
    inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
  }
}
