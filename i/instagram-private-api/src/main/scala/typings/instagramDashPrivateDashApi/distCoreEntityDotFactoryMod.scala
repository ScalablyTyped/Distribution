package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distEntitiesMod.DirectThreadEntity
import typings.instagramDashPrivateDashApi.distEntitiesMod.ProfileEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/entity.factory", JSImport.Namespace)
@js.native
object distCoreEntityDotFactoryMod extends js.Object {
  @js.native
  class EntityFactory () extends Repository {
    def directThread(id: String): DirectThreadEntity = js.native
    def directThread(id: js.Array[String]): DirectThreadEntity = js.native
    def profile(pk: String): ProfileEntity = js.native
  }
  
}

