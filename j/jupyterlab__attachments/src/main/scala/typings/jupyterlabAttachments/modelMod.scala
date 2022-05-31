package typings.jupyterlabAttachments

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.ChangedArgs
import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IContentFactory
import typings.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions
import typings.jupyterlabNbformat.mod.IAttachments
import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs
import typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel")
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class AttachmentsModel ()
    extends StObject
       with IAttachmentsModel {
    def this(options: IOptions) = this()
    
    /* private */ var _changeGuard: js.Any = js.native
    
    /* private */ var _changed: js.Any = js.native
    
    /**
      * Create an attachment item and hook up its signals.
      */
    /* private */ var _createItem: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /* private */ var _map: js.Any = js.native
    
    /* private */ var _modelDB: js.Any = js.native
    
    /**
      * Handle a change to an item.
      */
    /* private */ var _onGenericChange: js.Any = js.native
    
    /**
      * Handle a change to the list.
      */
    /* private */ var _onMapChanged: js.Any = js.native
    
    /**
      * If the serialized version of the outputs have changed due to a remote
      * action, then update the model accordingly.
      */
    /* private */ var _onSerializedChanged: js.Any = js.native
    
    /* private */ var _serialized: js.Any = js.native
    
    /* private */ var _stateChanged: js.Any = js.native
    
    /**
      * A signal emitted when the model changes.
      */
    /* CompleteClass */
    override val changed: ISignal[IAttachmentsModel, ChangedArgs] = js.native
    /**
      * A signal emitted when the model changes.
      */
    @JSName("changed")
    def changed_MAttachmentsModel: ISignal[this.type, ChangedArgs] = js.native
    
    /**
      * Clear all of the attachments.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * The attachment content factory used by the model.
      */
    /* CompleteClass */
    override val contentFactory: IContentFactory = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Deserialize the model from JSON.
      *
      * #### Notes
      * This will clear any existing data.
      */
    /* CompleteClass */
    override def fromJSON(values: IAttachments): Unit = js.native
    
    /**
      * Get an item for the specified key.
      */
    /* CompleteClass */
    override def get(key: String): js.UndefOr[IAttachmentModel] = js.native
    
    /**
      * Whether the specified key is set.
      */
    /* CompleteClass */
    override def has(key: String): Boolean = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the model is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MAttachmentsModel: Boolean = js.native
    
    /**
      * The keys of the attachments in the model.
      */
    /* CompleteClass */
    override val keys: js.Array[String] = js.native
    /**
      * The keys of the attachments in the model.
      */
    @JSName("keys")
    def keys_MAttachmentsModel: js.Array[String] = js.native
    
    /**
      * The length of the items in the model.
      */
    /* CompleteClass */
    override val length: Double = js.native
    /**
      * Get the length of the items in the model.
      */
    @JSName("length")
    def length_MAttachmentsModel: Double = js.native
    
    /**
      * Remove the attachment whose name is the specified key.
      * Note that this is optional only until Jupyterlab 2.0 release.
      */
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /**
      * Set the value of the specified key.
      */
    /* CompleteClass */
    override def set(key: String, attachment: IMimeBundle): Unit = js.native
    
    /**
      * A signal emitted when the model state changes.
      */
    /* CompleteClass */
    override val stateChanged: ISignal[IAttachmentsModel, Unit] = js.native
    /**
      * A signal emitted when the model state changes.
      */
    @JSName("stateChanged")
    def stateChanged_MAttachmentsModel: ISignal[IAttachmentsModel, Unit] = js.native
    
    /**
      * Serialize the model to JSON.
      */
    /* CompleteClass */
    override def toJSON(): IAttachments = js.native
  }
  object AttachmentsModel {
    
    /**
      * The default implementation of a `IAttachemntsModel.IContentFactory`.
      */
    @JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel.ContentFactory")
    @js.native
    class ContentFactory ()
      extends StObject
         with IContentFactory {
      
      /**
        * Create an attachment model.
        */
      /* CompleteClass */
      override def createAttachmentModel(options: typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions): IAttachmentModel = js.native
    }
    
    /**
      * The default attachment model factory.
      */
    @JSImport("@jupyterlab/attachments/lib/model", "AttachmentsModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/attachments/lib/model", "AttachmentsResolver")
  @js.native
  class AttachmentsResolver protected ()
    extends StObject
       with IResolver {
    /**
      * Create an attachments resolver object.
      */
    def this(options: typings.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions) = this()
    
    /* private */ var _model: js.Any = js.native
    
    /* private */ var _parent: js.Any = js.native
    
    /**
      * Get the download url for a given absolute url path.
      *
      * #### Notes
      * This URL may include a query parameter.
      */
    /* CompleteClass */
    override def getDownloadUrl(url: String): js.Promise[String] = js.native
    
    /**
      * Whether the URL should be handled by the resolver
      * or not.
      */
    @JSName("isLocal")
    def isLocal_MAttachmentsResolver(url: String): Boolean = js.native
    
    /**
      * Resolve a relative url to an absolute url path.
      */
    /* CompleteClass */
    override def resolveUrl(url: String): js.Promise[String] = js.native
  }
  object AttachmentsResolver {
    
    /**
      * The options used to create an AttachmentsResolver.
      */
    trait IOptions extends StObject {
      
      /**
        * The attachments model to resolve against.
        */
      var model: IAttachmentsModel
      
      /**
        * A parent resolver to use if the URL/path is not for an attachment.
        */
      var parent: js.UndefOr[IResolver] = js.undefined
    }
    object IOptions {
      
      inline def apply(model: IAttachmentsModel): typings.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions]
      }
      
      extension [Self <: typings.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions](x: Self) {
        
        inline def setModel(value: IAttachmentsModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setParent(value: IResolver): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
  }
  
  trait IAttachmentsModel
    extends StObject
       with IDisposable {
    
    /**
      * A signal emitted when the model changes.
      */
    val changed: ISignal[IAttachmentsModel, ChangedArgs]
    
    /**
      * Clear all of the attachments.
      */
    def clear(): Unit
    
    /**
      * The attachment content factory used by the model.
      */
    val contentFactory: IContentFactory
    
    /**
      * Deserialize the model from JSON.
      *
      * #### Notes
      * This will clear any existing data.
      */
    def fromJSON(values: IAttachments): Unit
    
    /**
      * Get an item for the specified key.
      */
    def get(key: String): js.UndefOr[IAttachmentModel]
    
    /**
      * Whether the specified key is set.
      */
    def has(key: String): Boolean
    
    /**
      * The keys of the attachments in the model.
      */
    val keys: js.Array[String]
    
    /**
      * The length of the items in the model.
      */
    val length: Double
    
    /**
      * Remove the attachment whose name is the specified key.
      * Note that this is optional only until Jupyterlab 2.0 release.
      */
    def remove(key: String): Unit
    
    /**
      * Set the value of the specified key.
      */
    def set(key: String, attachment: IMimeBundle): Unit
    
    /**
      * A signal emitted when the model state changes.
      */
    val stateChanged: ISignal[IAttachmentsModel, Unit]
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): IAttachments
  }
  object IAttachmentsModel {
    
    inline def apply(
      changed: ISignal[IAttachmentsModel, ChangedArgs],
      clear: () => Unit,
      contentFactory: IContentFactory,
      dispose: () => Unit,
      fromJSON: IAttachments => Unit,
      get: String => js.UndefOr[IAttachmentModel],
      has: String => Boolean,
      isDisposed: Boolean,
      keys: js.Array[String],
      length: Double,
      remove: String => Unit,
      set: (String, IMimeBundle) => Unit,
      stateChanged: ISignal[IAttachmentsModel, Unit],
      toJSON: () => IAttachments
    ): IAttachmentsModel = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contentFactory = contentFactory.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[IAttachmentsModel]
    }
    
    /**
      * A type alias for changed args.
      */
    type ChangedArgs = IChangedArgs[IAttachmentModel]
    
    extension [Self <: IAttachmentsModel](x: Self) {
      
      inline def setChanged(value: ISignal[IAttachmentsModel, ChangedArgs]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
      
      inline def setFromJSON(value: IAttachments => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => js.UndefOr[IAttachmentModel]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, IMimeBundle) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setStateChanged(value: ISignal[IAttachmentsModel, Unit]): Self = StObject.set(x, "stateChanged", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => IAttachments): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
    
    /**
      * The interface for an attachment content factory.
      */
    trait IContentFactory extends StObject {
      
      /**
        * Create an attachment model.
        */
      def createAttachmentModel(options: typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions): IAttachmentModel
    }
    object IContentFactory {
      
      inline def apply(
        createAttachmentModel: typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions => IAttachmentModel
      ): IContentFactory = {
        val __obj = js.Dynamic.literal(createAttachmentModel = js.Any.fromFunction1(createAttachmentModel))
        __obj.asInstanceOf[IContentFactory]
      }
      
      extension [Self <: IContentFactory](x: Self) {
        
        inline def setCreateAttachmentModel(
          value: typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions => IAttachmentModel
        ): Self = StObject.set(x, "createAttachmentModel", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The options used to create a attachments model.
      */
    trait IOptions extends StObject {
      
      /**
        * The attachment content factory used by the model.
        *
        * If not given, a default factory will be used.
        */
      var contentFactory: js.UndefOr[IContentFactory] = js.undefined
      
      /**
        * An optional IModelDB to store the attachments model.
        */
      var modelDB: js.UndefOr[IModelDB] = js.undefined
      
      /**
        * The initial values for the model.
        */
      var values: js.UndefOr[IAttachments] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setContentFactory(value: IContentFactory): Self = StObject.set(x, "contentFactory", value.asInstanceOf[js.Any])
        
        inline def setContentFactoryUndefined: Self = StObject.set(x, "contentFactory", js.undefined)
        
        inline def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
        
        inline def setModelDBUndefined: Self = StObject.set(x, "modelDB", js.undefined)
        
        inline def setValues(value: IAttachments): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      }
    }
  }
}
