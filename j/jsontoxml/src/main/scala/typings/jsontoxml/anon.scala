package typings.jsontoxml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Standalone extends StObject {
    
    var standalone: js.UndefOr[Boolean] = js.native
  }
  object Standalone {
    
    @scala.inline
    def apply(): Standalone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Standalone]
    }
    
    @scala.inline
    implicit class StandaloneMutableBuilder[Self <: Standalone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
}
