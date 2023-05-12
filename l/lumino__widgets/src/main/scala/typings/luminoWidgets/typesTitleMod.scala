package typings.luminoWidgets

import org.scalablytyped.runtime.StringDictionary
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoVirtualdom.mod.VirtualElement.IRenderer
import typings.luminoWidgets.typesTitleMod.Title.Dataset
import typings.luminoWidgets.typesTitleMod.Title.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTitleMod {
  
  @JSImport("@lumino/widgets/types/title", "Title")
  @js.native
  open class Title[T] protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new title.
      *
      * @param options - The options for initializing the title.
      */
    def this(options: IOptions[T]) = this()
    
    /* private */ var _caption: Any = js.native
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _className: Any = js.native
    
    /* private */ var _closable: Any = js.native
    
    /* private */ var _dataset: Any = js.native
    
    /* private */ var _icon: Any = js.native
    
    /* private */ var _iconClass: Any = js.native
    
    /* private */ var _iconLabel: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _label: Any = js.native
    
    /* private */ var _mnemonic: Any = js.native
    
    /**
      * Get the caption for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    def caption: String = js.native
    /**
      * Set the caption for the title.
      */
    def caption_=(value: String): Unit = js.native
    
    /**
      * A signal emitted when the state of the title changes.
      */
    def changed: ISignal[this.type, Unit] = js.native
    
    /**
      * Get the extra class name for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    def className: String = js.native
    /**
      * Set the extra class name for the title.
      *
      * #### Notes
      * Multiple class names can be separated with whitespace.
      */
    def className_=(value: String): Unit = js.native
    
    /**
      * Get the closable state for the title.
      *
      * #### Notes
      * The default value is `false`.
      */
    def closable: Boolean = js.native
    /**
      * Set the closable state for the title.
      *
      * #### Notes
      * This controls the presence of a close icon when applicable.
      */
    def closable_=(value: Boolean): Unit = js.native
    
    /**
      * Get the dataset for the title.
      *
      * #### Notes
      * The default value is an empty dataset.
      */
    def dataset: Dataset = js.native
    /**
      * Set the dataset for the title.
      *
      * #### Notes
      * This controls the data attributes when applicable.
      */
    def dataset_=(value: Dataset): Unit = js.native
    
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
      * Get the icon renderer for the title.
      *
      * #### Notes
      * The default value is undefined.
      */
    def icon: js.UndefOr[IRenderer] = js.native
    
    /**
      * Get the icon class name for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    def iconClass: String = js.native
    /**
      * Set the icon class name for the title.
      *
      * #### Notes
      * Multiple class names can be separated with whitespace.
      */
    def iconClass_=(value: String): Unit = js.native
    
    /**
      * Get the icon label for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    def iconLabel: String = js.native
    /**
      * Set the icon label for the title.
      *
      * #### Notes
      * Multiple class names can be separated with whitespace.
      */
    def iconLabel_=(value: String): Unit = js.native
    
    /**
      * Set the icon renderer for the title.
      *
      * #### Notes
      * A renderer is an object that supplies a render and unrender function.
      */
    def icon_=(value: js.UndefOr[IRenderer]): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the title has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MTitle: Boolean = js.native
    
    /**
      * Get the label for the title.
      *
      * #### Notes
      * The default value is an empty string.
      */
    def label: String = js.native
    /**
      * Set the label for the title.
      */
    def label_=(value: String): Unit = js.native
    
    /**
      * Get the mnemonic index for the title.
      *
      * #### Notes
      * The default value is `-1`.
      */
    def mnemonic: Double = js.native
    /**
      * Set the mnemonic index for the title.
      */
    def mnemonic_=(value: Double): Unit = js.native
    
    /**
      * The object which owns the title.
      */
    val owner: T = js.native
  }
  object Title {
    
    /**
      * A type alias for a simple immutable string dataset.
      */
    type Dataset = StringDictionary[String]
    
    /**
      * An options object for initializing a title.
      */
    trait IOptions[T] extends StObject {
      
      /**
        * The caption for the title.
        */
      var caption: js.UndefOr[String] = js.undefined
      
      /**
        * The extra class name for the title.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * The closable state for the title.
        */
      var closable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The dataset for the title.
        */
      var dataset: js.UndefOr[Dataset] = js.undefined
      
      /**
        * The icon renderer for the title.
        */
      var icon: js.UndefOr[IRenderer] = js.undefined
      
      /**
        * The icon class name for the title.
        */
      var iconClass: js.UndefOr[String] = js.undefined
      
      /**
        * The icon label for the title.
        */
      var iconLabel: js.UndefOr[String] = js.undefined
      
      /**
        * The label for the title.
        */
      var label: js.UndefOr[String] = js.undefined
      
      /**
        * The mnemonic index for the title.
        */
      var mnemonic: js.UndefOr[Double] = js.undefined
      
      /**
        * The object which owns the title.
        */
      var owner: T
    }
    object IOptions {
      
      inline def apply[T](owner: T): IOptions[T] = {
        val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions[?], T] (val x: Self & IOptions[T]) extends AnyVal {
        
        inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
        
        inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
        
        inline def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
        
        inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
        
        inline def setIcon(value: IRenderer): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
        
        inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        inline def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setMnemonic(value: Double): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
        
        inline def setMnemonicUndefined: Self = StObject.set(x, "mnemonic", js.undefined)
        
        inline def setOwner(value: T): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      }
    }
  }
}
