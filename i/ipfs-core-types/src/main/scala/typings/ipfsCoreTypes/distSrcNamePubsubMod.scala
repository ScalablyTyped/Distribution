package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNamePubsubMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Cancel a name subscription.
      *
      * @example
      * ```js
      * const name = 'QmQrX8hka2BtNHa8N8arAq16TCVx5qHcb46c5yPewRycLm'
      * const result = await ipfs.name.pubsub.cancel(name)
      * console.log(result.canceled)
      * // Logs: true
      * ```
      */
    def cancel(name: String): js.Promise[PubsubCancelResult] = js.native
    def cancel(name: String, options: AbortOptions & OptionExtension): js.Promise[PubsubCancelResult] = js.native
    
    /**
      * Query the state of IPNS pubsub.
      *
      * @returns {Promise<{ enabled: boolean }>}
      * ```js
      * const result = await ipfs.name.pubsub.state()
      * console.log(result.enabled)
      * // Logs: true
      * ```
      */
    def state(): js.Promise[PubsubStateResult] = js.native
    def state(options: AbortOptions & OptionExtension): js.Promise[PubsubStateResult] = js.native
    
    /**
      * Show current name subscriptions.
      *
      * @example
      * ```js
      * const result = await ipfs.name.pubsub.subs()
      * console.log(result)
      * // Logs: ['/ipns/QmQrX8hka2BtNHa8N8arAq16TCVx5qHcb46c5yPewRycLm']
      * ```
      */
    def subs(): js.Promise[js.Array[String]] = js.native
    def subs(options: AbortOptions & OptionExtension): js.Promise[js.Array[String]] = js.native
  }
  
  trait PubsubCancelResult extends StObject {
    
    var canceled: Boolean
  }
  object PubsubCancelResult {
    
    inline def apply(canceled: Boolean): PubsubCancelResult = {
      val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
      __obj.asInstanceOf[PubsubCancelResult]
    }
    
    extension [Self <: PubsubCancelResult](x: Self) {
      
      inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    }
  }
  
  trait PubsubStateResult extends StObject {
    
    var enabled: Boolean
  }
  object PubsubStateResult {
    
    inline def apply(enabled: Boolean): PubsubStateResult = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[PubsubStateResult]
    }
    
    extension [Self <: PubsubStateResult](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
