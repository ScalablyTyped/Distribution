package typings.manaSyringe

import typings.manaSyringe.coreMod.Syringe.DefinedToken
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contributionProtocolMod {
  
  @js.native
  trait Provider[T /* <: Record[String, Any] */] extends StObject {
    
    def getContributions(): js.Array[T] = js.native
    def getContributions(option: Option): js.Array[T] = js.native
  }
  @JSImport("mana-syringe/lib/contribution/contribution-protocol", "Provider")
  @js.native
  val Provider: DefinedToken = js.native
  
  trait Option extends StObject {
    
    /**
      * use cache
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * collected from the parent containers
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
