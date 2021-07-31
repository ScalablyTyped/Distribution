package typings.logkitty

import typings.logkitty.typesMod.Entry
import typings.logkitty.typesMod.IFilter
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosFilterMod {
  
  @JSImport("logkitty/build/ios/IosFilter", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with IosFilter {
    def this(minPriority: Double) = this()
    
    /* CompleteClass */
    var filter: js.Any = js.native
    
    /* CompleteClass */
    override val minPriority: js.Any = js.native
    
    /* CompleteClass */
    override def setFilterByMatch(regexes: js.Array[RegExp]): Unit = js.native
    
    /* CompleteClass */
    override def setFilterByTag(tags: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def shouldInclude(entry: Entry): Boolean = js.native
  }
  
  trait IosFilter
    extends StObject
       with IFilter {
    
    var filter: js.Any
    
    val minPriority: js.Any
    
    def setFilterByMatch(regexes: js.Array[RegExp]): Unit
    
    def setFilterByTag(tags: js.Array[String]): Unit
  }
  object IosFilter {
    
    @scala.inline
    def apply(
      filter: js.Any,
      minPriority: js.Any,
      setFilterByMatch: js.Array[RegExp] => Unit,
      setFilterByTag: js.Array[String] => Unit,
      shouldInclude: Entry => Boolean
    ): IosFilter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], minPriority = minPriority.asInstanceOf[js.Any], setFilterByMatch = js.Any.fromFunction1(setFilterByMatch), setFilterByTag = js.Any.fromFunction1(setFilterByTag), shouldInclude = js.Any.fromFunction1(shouldInclude))
      __obj.asInstanceOf[IosFilter]
    }
    
    @scala.inline
    implicit class IosFilterMutableBuilder[Self <: IosFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPriority(value: js.Any): Self = StObject.set(x, "minPriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetFilterByMatch(value: js.Array[RegExp] => Unit): Self = StObject.set(x, "setFilterByMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFilterByTag(value: js.Array[String] => Unit): Self = StObject.set(x, "setFilterByTag", js.Any.fromFunction1(value))
    }
  }
}
