package typings.jestJsonSchema

import typings.ajv.mod.Ajv
import typings.ajv.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-json-schema", "matchers")
  @js.native
  val matchers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ExpectExtendMap */ js.Any = js.native
  
  @JSImport("jest-json-schema", "matchersWithOptions")
  @js.native
  def matchersWithOptions(options: Options): js.Any = js.native
  @JSImport("jest-json-schema", "matchersWithOptions")
  @js.native
  def matchersWithOptions(options: Options, extendAjv: js.Function1[/* ajv */ Ajv, Unit]): js.Any = js.native
  
  object global {
    
    object jest {
      
      @js.native
      trait Matchers[R, T] extends StObject {
        
        def toBeValidSchema(): R = js.native
        
        def toMatchSchema(schema: js.Object): R = js.native
      }
      object Matchers {
        
        @scala.inline
        def apply[R, T](toBeValidSchema: () => R, toMatchSchema: js.Object => R): Matchers[R, T] = {
          val __obj = js.Dynamic.literal(toBeValidSchema = js.Any.fromFunction0(toBeValidSchema), toMatchSchema = js.Any.fromFunction1(toMatchSchema))
          __obj.asInstanceOf[Matchers[R, T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[_, _], R, T] (val x: Self with (Matchers[R, T])) extends AnyVal {
          
          @scala.inline
          def setToBeValidSchema(value: () => R): Self = StObject.set(x, "toBeValidSchema", js.Any.fromFunction0(value))
          
          @scala.inline
          def setToMatchSchema(value: js.Object => R): Self = StObject.set(x, "toMatchSchema", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
