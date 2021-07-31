package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleapis.anon.Apnsdevicetoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a push token ID resource.
  */
trait SchemaPushTokenId extends StObject {
  
  /**
    * A push token ID for iOS devices.
    */
  var ios: js.UndefOr[Apnsdevicetoken] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#pushTokenId.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaPushTokenId {
  
  @scala.inline
  def apply(): SchemaPushTokenId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushTokenId]
  }
  
  @scala.inline
  implicit class SchemaPushTokenIdMutableBuilder[Self <: SchemaPushTokenId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIos(value: Apnsdevicetoken): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
