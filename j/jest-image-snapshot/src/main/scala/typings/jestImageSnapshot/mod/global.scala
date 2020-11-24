package typings.jestImageSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object jest extends js.Object {
    
    @js.native
    trait Matchers[R, T] extends js.Object {
      
      def toMatchImageSnapshot(): R = js.native
      def toMatchImageSnapshot(options: MatchImageSnapshotOptions): R = js.native
    }
  }
}
