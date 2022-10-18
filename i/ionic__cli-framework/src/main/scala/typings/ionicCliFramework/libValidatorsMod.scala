package typings.ionicCliFramework

import typings.ionicCliFramework.anon.CaseSensitive
import typings.ionicCliFramework.definitionsMod.Validator
import typings.ionicCliFramework.definitionsMod.Validators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValidatorsMod {
  
  @JSImport("@ionic/cli-framework/lib/validators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combine(validators: Validator*): Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(validators.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Validator]
  
  inline def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: CaseSensitive): Validator = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(values.asInstanceOf[js.Any], hasCaseSensitive.asInstanceOf[js.Any])).asInstanceOf[Validator]
  
  inline def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], validatorsToUse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/cli-framework/lib/validators", "validators")
  @js.native
  val validators: Validators = js.native
}
