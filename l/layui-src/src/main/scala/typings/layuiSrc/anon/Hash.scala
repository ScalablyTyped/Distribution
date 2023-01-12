package typings.layuiSrc.anon

import typings.layuiSrc.Layui.UrlHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var hash: UrlHash
  
  var pathname: js.Array[String]
  
  var search: js.Object
}
object Hash {
  
  inline def apply(hash: UrlHash, pathname: js.Array[String], search: js.Object): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    inline def setHash(value: UrlHash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: js.Array[String]): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameVarargs(value: String*): Self = StObject.set(x, "pathname", js.Array(value*))
    
    inline def setSearch(value: js.Object): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
