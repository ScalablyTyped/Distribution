package typings.ionicCliFramework

import typings.ionicCliFramework.anon.CaseSensitive
import typings.ionicCliFramework.definitionsMod.Validator
import typings.ionicCliFramework.definitionsMod.Validators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsMod {
  
  @JSImport("@ionic/cli-framework/lib/validators", "combine")
  @js.native
  def combine(validators: Validator*): Validator = js.native
  
  @JSImport("@ionic/cli-framework/lib/validators", "contains")
  @js.native
  def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: CaseSensitive): Validator = js.native
  
  @JSImport("@ionic/cli-framework/lib/validators", "validate")
  @js.native
  def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = js.native
  
  @JSImport("@ionic/cli-framework/lib/validators", "validators")
  @js.native
  val validators: Validators = js.native
}
