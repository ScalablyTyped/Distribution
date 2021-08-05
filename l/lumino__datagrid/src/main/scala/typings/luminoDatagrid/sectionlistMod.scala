package typings.luminoDatagrid

import typings.luminoDatagrid.sectionlistMod.SectionList.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionlistMod {
  
  @JSImport("@lumino/datagrid/lib/sectionlist", "SectionList")
  @js.native
  class SectionList protected () extends StObject {
    /**
      * Construct a new section list.
      *
      * @param options - The options for initializing the list.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _count: js.Any = js.native
    
    /* private */ var _defaultSize: js.Any = js.native
    
    /* private */ var _length: js.Any = js.native
    
    /* private */ var _sections: js.Any = js.native
    
    /**
      * Remove all sections from the list.
      *
      * #### Complexity
      * Constant.
      */
    def clear(): Unit = js.native
    
    /**
      * The total number of sections in the list.
      *
      * #### Complexity
      * Constant.
      */
    val count: Double = js.native
    
    /**
      * Get the default size of sections in the list.
      *
      * #### Complexity
      * Constant.
      */
    /**
      * Set the default size of sections in the list.
      *
      * #### Complexity
      * Linear on the number of resized sections.
      */
    var defaultSize: Double = js.native
    
    /**
      * Find the extent of the section at the given index.
      *
      * @param index - The index of the section of interest.
      *
      * @returns The extent of the section at the given index, or `-1`
      *   if the index is out of range.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      *
      * #### Complexity
      * Logarithmic on the number of resized sections.
      */
    def extentOf(index: Double): Double = js.native
    
    /**
      * Find the index of the section which covers the given offset.
      *
      * @param offset - The offset of the section of interest.
      *
      * @returns The index of the section which covers the given offset,
      *   or `-1` if the offset is out of range.
      *
      * #### Complexity
      * Logarithmic on the number of resized sections.
      */
    def indexOf(offset: Double): Double = js.native
    
    /**
      * Insert sections into the list.
      *
      * @param index - The index at which to insert the sections. This
      *   value will be clamped to the bounds of the list.
      *
      * @param count - The number of sections to insert. This method
      *   is a no-op if this value is `<= 0`.
      *
      * #### Undefined Behavior
      * An `index` or `count` which is non-integral.
      *
      * #### Complexity
      * Linear on the number of resized sections.
      */
    def insert(index: Double, count: Double): Unit = js.native
    
    /**
      * The total size of all sections in the list.
      *
      * #### Complexity
      * Constant.
      */
    val length: Double = js.native
    
    /**
      * Move sections within the list.
      *
      * @param index - The index of the first section to move. This method
      *   is a no-op if this value is out of range.
      *
      * @param count - The number of sections to move. This method is a
      *   no-op if this value is `<= 0`.
      *
      * @param destination - The destination index for the first section.
      *   This value will be clamped to the allowable range.
      *
      * #### Undefined Behavior
      * An `index`, `count`, or `destination` which is non-integral.
      *
      * #### Complexity
      * Linear on the number of moved resized sections.
      */
    def move(index: Double, count: Double, destination: Double): Unit = js.native
    
    /**
      * Find the offset of the section at the given index.
      *
      * @param index - The index of the section of interest.
      *
      * @returns The offset of the section at the given index, or `-1`
      *   if the index is out of range.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      *
      * #### Complexity
      * Logarithmic on the number of resized sections.
      */
    def offsetOf(index: Double): Double = js.native
    
    /**
      * Remove sections from the list.
      *
      * @param index - The index of the first section to remove. This
      *   method is a no-op if this value is out of range.
      *
      * @param count - The number of sections to remove. This method
      *   is a no-op if this value is `<= 0`.
      *
      * #### Undefined Behavior
      * An `index` or `count` which is non-integral.
      *
      * #### Complexity
      * Linear on the number of resized sections.
      */
    def remove(index: Double, count: Double): Unit = js.native
    
    /**
      * Reset all modified sections to the default size.
      *
      * #### Complexity
      * Constant.
      */
    def reset(): Unit = js.native
    
    /**
      * Resize a section in the list.
      *
      * @param index - The index of the section to resize. This method
      *   is a no-op if this value is out of range.
      *
      * @param size - The new size of the section. This value will be
      *   clamped to an integer `>= 0`.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      *
      * #### Complexity
      * Linear on the number of resized sections.
      */
    def resize(index: Double, size: Double): Unit = js.native
    
    /**
      * Find the size of the section at the given index.
      *
      * @param index - The index of the section of interest.
      *
      * @returns The size of the section at the given index, or `-1`
      *   if the index is out of range.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      *
      * #### Complexity
      * Logarithmic on the number of resized sections.
      */
    def sizeOf(index: Double): Double = js.native
  }
  object SectionList {
    
    /**
      * An options object for initializing a section list.
      */
    trait IOptions extends StObject {
      
      /**
        * The size of new sections added to the list.
        */
      var defaultSize: Double
    }
    object IOptions {
      
      inline def apply(defaultSize: Double): IOptions = {
        val __obj = js.Dynamic.literal(defaultSize = defaultSize.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      }
    }
  }
}
