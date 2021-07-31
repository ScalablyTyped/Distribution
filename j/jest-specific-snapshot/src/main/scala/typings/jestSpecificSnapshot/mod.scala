package typings.jestSpecificSnapshot

import typings.jestSpecificSnapshot.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-specific-snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addSerializer(serializer: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSerializer")(serializer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def toMatchSpecificSnapshot(data: js.Any, snapshotFile: String, testName: String): js.Function0[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("toMatchSpecificSnapshot")(data.asInstanceOf[js.Any], snapshotFile.asInstanceOf[js.Any], testName.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Message]]
  
  object global {
    
    object jest {
      
      trait Matchers[R, T] extends StObject {
        
        def toMatchSpecificSnapshot(snapshotFilename: String): R
      }
      object Matchers {
        
        @scala.inline
        def apply[R, T](toMatchSpecificSnapshot: String => R): Matchers[R, T] = {
          val __obj = js.Dynamic.literal(toMatchSpecificSnapshot = js.Any.fromFunction1(toMatchSpecificSnapshot))
          __obj.asInstanceOf[Matchers[R, T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?, ?], R, T] (val x: Self & (Matchers[R, T])) extends AnyVal {
          
          @scala.inline
          def setToMatchSpecificSnapshot(value: String => R): Self = StObject.set(x, "toMatchSpecificSnapshot", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
