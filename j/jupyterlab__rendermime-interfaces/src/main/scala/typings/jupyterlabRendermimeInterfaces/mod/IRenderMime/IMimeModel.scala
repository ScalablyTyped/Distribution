package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A model for mime data.
  */
trait IMimeModel extends StObject {
  
  /**
    * The data associated with the model.
    */
  val data: ReadonlyPartialJSONObject
  
  /**
    * The metadata associated with the model.
    *
    * Among others, it can include an attribute named `fragment`
    * that stores a URI fragment identifier for the MIME resource.
    */
  val metadata: ReadonlyPartialJSONObject
  
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  def setData(options: ISetDataOptions): Unit
  
  /**
    * Whether the data in the model is trusted.
    */
  val trusted: Boolean
}
/**
  * The namespace for IMimeModel associated interfaces.
  */
object IMimeModel {
  
  inline def apply(
    data: ReadonlyPartialJSONObject,
    metadata: ReadonlyPartialJSONObject,
    setData: ISetDataOptions => Unit,
    trusted: Boolean
  ): IMimeModel = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMimeModel]
  }
  
  extension [Self <: IMimeModel](x: Self) {
    
    inline def setData(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSetData(value: ISetDataOptions => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
  }
  
  /**
    * The options used to update a mime model.
    */
  trait ISetDataOptions extends StObject {
    
    /**
      * The new data object.
      */
    var data: js.UndefOr[ReadonlyPartialJSONObject] = js.undefined
    
    /**
      * The new metadata object.
      */
    var metadata: js.UndefOr[ReadonlyPartialJSONObject] = js.undefined
  }
  object ISetDataOptions {
    
    inline def apply(): ISetDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISetDataOptions]
    }
    
    extension [Self <: ISetDataOptions](x: Self) {
      
      inline def setData(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMetadata(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
