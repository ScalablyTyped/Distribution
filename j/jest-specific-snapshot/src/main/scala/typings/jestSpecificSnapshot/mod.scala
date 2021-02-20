package typings.jestSpecificSnapshot

import typings.jestSpecificSnapshot.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-specific-snapshot", "addSerializer")
  @js.native
  def addSerializer(serializer: js.Any): Unit = js.native
  
  @JSImport("jest-specific-snapshot", "toMatchSpecificSnapshot")
  @js.native
  def toMatchSpecificSnapshot(data: js.Any, snapshotFile: String, testName: String): js.Function0[Message] = js.native
  
  object global {
    
    object jest {
      
      @js.native
      trait Matchers[R, T] extends StObject {
        
        def toMatchSpecificSnapshot(snapshotFilename: String): R = js.native
      }
      object Matchers {
        
        @scala.inline
        def apply[R, T](toMatchSpecificSnapshot: String => R): Matchers[R, T] = {
          val __obj = js.Dynamic.literal(toMatchSpecificSnapshot = js.Any.fromFunction1(toMatchSpecificSnapshot))
          __obj.asInstanceOf[Matchers[R, T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[_, _], R, T] (val x: Self with (Matchers[R, T])) extends AnyVal {
          
          @scala.inline
          def setToMatchSpecificSnapshot(value: String => R): Self = StObject.set(x, "toMatchSpecificSnapshot", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
