package typings.gulpSort

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Sort files in stream by path or any custom sort comparator */
  @scala.inline
  def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(comparator: IComparatorFunction): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(comparator.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(options: IOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
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
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsc(value: Boolean): Self = StObject.set(x, "asc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAscUndefined: Self = StObject.set(x, "asc", js.undefined)
      
      @scala.inline
      def setComparator(value: (/* file1 */ File, /* file2 */ File) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    }
  }
}
