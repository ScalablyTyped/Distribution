package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.Service.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Providers define interfaces for layers to access data.
  * The input data can be stored locally or loaded from the network. Data can be loaded by tiles or in one chunk.
  * This provider allows you to supply data stored locally or fetched using external tools.
  */
@js.native
trait Provider
  extends StObject
     with typings.heremaps.H.map.provider.Provider {
  
  /**
    * Retrieves the provider data.
    * @returns - JSON object
    */
  def getData(): Data = js.native
  
  /**
    * Updates the provider data. When data is updated, the update event is triggered so that the consuming layers are redrawn.
    * @param data - JSON object
    */
  def setData(data: Data): Unit = js.native
}
