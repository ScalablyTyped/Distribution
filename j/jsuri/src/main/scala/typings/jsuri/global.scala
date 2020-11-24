package typings.jsuri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object jsuri extends js.Object {
    
    @js.native
    /**
      * Creates a new Uri object
      * @constructor
      * @param {string} str
      */
    class Uri ()
      extends typings.jsuri.jsuri.Uri {
      def this(str: String) = this()
    }
  }
}
