package typings.jestJsonSchema

import typings.ajv.mod.Ajv
import typings.ajv.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-json-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-json-schema", "matchers")
  @js.native
  val matchers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ExpectExtendMap */ js.Any = js.native
  
  @scala.inline
  def matchersWithOptions(options: Options): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("matchersWithOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def matchersWithOptions(options: Options, extendAjv: js.Function1[/* ajv */ Ajv, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchersWithOptions")(options.asInstanceOf[js.Any], extendAjv.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  object global {
    
    object jest {
      
      trait Matchers[R, T] extends StObject {
        
        def toBeValidSchema(): R
        
        def toMatchSchema(schema: js.Object): R
      }
      object Matchers {
        
        @scala.inline
        def apply[R, T](toBeValidSchema: () => R, toMatchSchema: js.Object => R): Matchers[R, T] = {
          val __obj = js.Dynamic.literal(toBeValidSchema = js.Any.fromFunction0(toBeValidSchema), toMatchSchema = js.Any.fromFunction1(toMatchSchema))
          __obj.asInstanceOf[Matchers[R, T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?, ?], R, T] (val x: Self & (Matchers[R, T])) extends AnyVal {
          
          @scala.inline
          def setToBeValidSchema(value: () => R): Self = StObject.set(x, "toBeValidSchema", js.Any.fromFunction0(value))
          
          @scala.inline
          def setToMatchSchema(value: js.Object => R): Self = StObject.set(x, "toMatchSchema", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
