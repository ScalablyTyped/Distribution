package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialRepudiationData
import typings.mangopay2NodejsSdk.mod.repudiation.RepudiationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Repudiation")
@js.native
class Repudiation protected ()
  extends EntityBase[RepudiationData]
     with RepudiationData {
  def this(data: PartialRepudiationData) = this()
}

