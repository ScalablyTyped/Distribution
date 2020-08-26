package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialMandateData
import typings.mangopay2NodejsSdk.mod.mandate.MandateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Mandate")
@js.native
class Mandate ()
  extends EntityBase[MandateData]
     with MandateData {
  def this(data: PartialMandateData) = this()
}

