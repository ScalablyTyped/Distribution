package typings.jake

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictname
    extends /* name */ StringDictionary[js.Any] {
    
    var quiet: Boolean = js.native
  }
  object Dictname {
    
    @scala.inline
    def apply(quiet: Boolean): Dictname = {
      val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictname]
    }
    
    @scala.inline
    implicit class DictnameMutableBuilder[Self <: Dictname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    }
  }
}
