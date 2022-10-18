package typings.gulpSort

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Sort files in stream by path or any custom sort comparator */
  inline def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  inline def apply(comparator: IComparatorFunction): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(comparator.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(options: IOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IComparatorFunction = js.Function2[/* file1 */ File, /* file2 */ File, Double]
  
  trait IOptions extends StObject {
    
    /** Whether to sort in ascending order, default is true */
    var asc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function to compare two files.
      * Returns:
      * -1 if file1 should be before file2,
      * 0 if file1 is equivalent to file2, and
      * 1 if file1 should be after file2
      */
    var comparator: js.UndefOr[IComparatorFunction] = js.undefined
    
    /** Whether to use a custom sort function. */
    var customSortFn: js.UndefOr[
        js.Function2[
          /* files */ js.Array[File], 
          /* comparator */ js.UndefOr[IComparatorFunction], 
          js.Array[File]
        ]
      ] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setAsc(value: Boolean): Self = StObject.set(x, "asc", value.asInstanceOf[js.Any])
      
      inline def setAscUndefined: Self = StObject.set(x, "asc", js.undefined)
      
      inline def setComparator(value: (/* file1 */ File, /* file2 */ File) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setCustomSortFn(
        value: (/* files */ js.Array[File], /* comparator */ js.UndefOr[IComparatorFunction]) => js.Array[File]
      ): Self = StObject.set(x, "customSortFn", js.Any.fromFunction2(value))
      
      inline def setCustomSortFnUndefined: Self = StObject.set(x, "customSortFn", js.undefined)
    }
  }
}
