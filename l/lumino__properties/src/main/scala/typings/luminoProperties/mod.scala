package typings.luminoProperties

import typings.luminoProperties.mod.AttachedProperty.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/properties", "AttachedProperty")
  @js.native
  class AttachedProperty[T, U] protected () extends StObject {
    /**
      * Construct a new attached property.
      *
      * @param options - The options for initializing the property.
      */
    def this(options: IOptions[T, U]) = this()
    
    /* private */ var _changed: js.Any = js.native
    
    /* private */ var _coerce: js.Any = js.native
    
    /**
      * Coerce the value for the given owner.
      */
    /* private */ var _coerceValue: js.Any = js.native
    
    /* private */ var _compare: js.Any = js.native
    
    /**
      * Compare the old value and new value for equality.
      */
    /* private */ var _compareValue: js.Any = js.native
    
    /* private */ var _create: js.Any = js.native
    
    /**
      * Get or create the default value for the given owner.
      */
    /* private */ var _createValue: js.Any = js.native
    
    /**
      * Run the change notification if the given values are different.
      */
    /* private */ var _maybeNotify: js.Any = js.native
    
    /* private */ var _pid: js.Any = js.native
    
    /**
      * Explicitly coerce the current property value for a given owner.
      *
      * @param owner - The property owner of interest.
      *
      * #### Notes
      * If the value has not yet been set, the default value will be
      * computed and used as the previous value for the comparison.
      */
    def coerce(owner: T): Unit = js.native
    
    /**
      * Get the current value of the property for a given owner.
      *
      * @param owner - The property owner of interest.
      *
      * @returns The current value of the property.
      *
      * #### Notes
      * If the value has not yet been set, the default value will be
      * computed and assigned as the current value of the property.
      */
    def get(owner: T): U = js.native
    
    /**
      * The human readable name for the property.
      */
    val name: String = js.native
    
    /**
      * Set the current value of the property for a given owner.
      *
      * @param owner - The property owner of interest.
      *
      * @param value - The value for the property.
      *
      * #### Notes
      * If the value has not yet been set, the default value will be
      * computed and used as the previous value for the comparison.
      */
    def set(owner: T, value: U): Unit = js.native
  }
  object AttachedProperty {
    
    @JSImport("@lumino/properties", "AttachedProperty")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clear the stored property data for the given owner.
      *
      * @param owner - The property owner of interest.
      *
      * #### Notes
      * This will clear all property values for the owner, but it will
      * **not** run the change notification for any of the properties.
      */
    inline def clearData(owner: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearData")(owner.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * The options object used to initialize an attached property.
      */
    trait IOptions[T, U] extends StObject {
      
      /**
        * A function called when the property value has changed.
        *
        * #### Notes
        * This will be invoked when the property value is changed and the
        * comparator indicates that the old value is not equal to the new
        * value.
        *
        * This will **not** be called for the initial default value.
        */
      var changed: js.UndefOr[js.Function3[/* owner */ T, /* oldValue */ U, /* newValue */ U, Unit]] = js.undefined
      
      /**
        * A function used to coerce a supplied value into the final value.
        *
        * #### Notes
        * This will be called whenever the property value is changed, or
        * when the property is explicitly coerced. The return value will
        * be used as the final value of the property.
        *
        * This will **not** be called for the initial default value.
        */
      var coerce: js.UndefOr[js.Function2[/* owner */ T, /* value */ U, U]] = js.undefined
      
      /**
        * A function used to compare two values for equality.
        *
        * #### Notes
        * This is called to determine if the property value has changed.
        * It should return `true` if the given values are equivalent, or
        * `false` if they are different.
        *
        * If this is not provided, it defaults to the `===` operator.
        */
      var compare: js.UndefOr[js.Function2[/* oldValue */ U, /* newValue */ U, Boolean]] = js.undefined
      
      /**
        * A factory function used to create the default property value.
        *
        * #### Notes
        * This will be called whenever the property value is required,
        * but has not yet been set for a given owner.
        */
      def create(owner: T): U
      
      /**
        * The human readable name for the property.
        *
        * #### Notes
        * By convention, this should be the same as the name used to define
        * the public accessor for the property value.
        *
        * This **does not** have an effect on the property lookup behavior.
        * Multiple properties may share the same name without conflict.
        */
      var name: String
    }
    object IOptions {
      
      inline def apply[T, U](create: T => U, name: String): IOptions[T, U] = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T, U]]
      }
      
      extension [Self <: IOptions[?, ?], T, U](x: Self & (IOptions[T, U])) {
        
        inline def setChanged(value: (/* owner */ T, /* oldValue */ U, /* newValue */ U) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction3(value))
        
        inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
        
        inline def setCoerce(value: (/* owner */ T, /* value */ U) => U): Self = StObject.set(x, "coerce", js.Any.fromFunction2(value))
        
        inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
        
        inline def setCompare(value: (/* oldValue */ U, /* newValue */ U) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
        
        inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
        
        inline def setCreate(value: T => U): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
