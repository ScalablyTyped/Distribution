package typings.lernaPackageGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<npm-package-arg.npm-package-arg.Result, 'gitCommittish' | 'gitRange' | 'fetchSpec'> */
  trait PickResultgitCommittishgi extends StObject {
    
    var fetchSpec: String | Null
    
    var gitCommittish: js.UndefOr[String] = js.undefined
    
    var gitRange: js.UndefOr[String] = js.undefined
  }
  object PickResultgitCommittishgi {
    
    inline def apply(): PickResultgitCommittishgi = {
      val __obj = js.Dynamic.literal(fetchSpec = null)
      __obj.asInstanceOf[PickResultgitCommittishgi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickResultgitCommittishgi] (val x: Self) extends AnyVal {
      
      inline def setFetchSpec(value: String): Self = StObject.set(x, "fetchSpec", value.asInstanceOf[js.Any])
      
      inline def setFetchSpecNull: Self = StObject.set(x, "fetchSpec", null)
      
      inline def setGitCommittish(value: String): Self = StObject.set(x, "gitCommittish", value.asInstanceOf[js.Any])
      
      inline def setGitCommittishUndefined: Self = StObject.set(x, "gitCommittish", js.undefined)
      
      inline def setGitRange(value: String): Self = StObject.set(x, "gitRange", value.asInstanceOf[js.Any])
      
      inline def setGitRangeUndefined: Self = StObject.set(x, "gitRange", js.undefined)
    }
  }
}
