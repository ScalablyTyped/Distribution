package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for detecting output from deidentification transformations such as
  * [`CryptoReplaceFfxFpeConfig`](/dlp/docs/reference/rest/v2/organizations.deidentifyTemplates#cryptoreplaceffxfpeconfig).
  * These types of transformations are those that perform pseudonymization,
  * thereby producing a &quot;surrogate&quot; as output. This should be used in
  * conjunction with a field on the transformation such as
  * `surrogate_info_type`. This CustomInfoType does not support the use of
  * `detection_rules`.
  */
trait SchemaGooglePrivacyDlpV2SurrogateType extends StObject
