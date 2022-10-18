package typings.ky

import typings.ky.anon.RequiredRetryOptions
import typings.ky.distributionTypesRetryMod.RetryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionUtilsNormalizeMod {
  
  @JSImport("ky/distribution/utils/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeRequestMethod(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequestMethod")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeRetryOptions(): RequiredRetryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRetryOptions")().asInstanceOf[RequiredRetryOptions]
  inline def normalizeRetryOptions(retry: Double): RequiredRetryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRetryOptions")(retry.asInstanceOf[js.Any]).asInstanceOf[RequiredRetryOptions]
  inline def normalizeRetryOptions(retry: RetryOptions): RequiredRetryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRetryOptions")(retry.asInstanceOf[js.Any]).asInstanceOf[RequiredRetryOptions]
}
