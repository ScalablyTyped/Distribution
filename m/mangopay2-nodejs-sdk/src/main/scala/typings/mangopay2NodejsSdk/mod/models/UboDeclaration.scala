package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.uboDeclaration.CreateUboDeclaration
import typings.mangopay2NodejsSdk.mod.uboDeclaration.UboDeclarationData
import typings.mangopay2NodejsSdk.mod.uboDeclaration.UpdateUboDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.UboDeclaration")
@js.native
class UboDeclaration protected ()
  extends EntityBase[UboDeclarationData]
     with UboDeclarationData {
  def this(data: CreateUboDeclaration) = this()
  def this(data: UpdateUboDeclaration) = this()
}
