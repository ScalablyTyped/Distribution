package typings.logkitty

import typings.logkitty.buildTypesMod.Entry
import typings.logkitty.buildTypesMod.IFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosIosFilterMod {
  
  @JSImport("logkitty/build/ios/IosFilter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IosFilter {
    def this(minPriority: Double) = this()
    
    /* private */ /* CompleteClass */
    var filter: Any = js.native
    
    /* private */ /* CompleteClass */
    override val minPriority: Any = js.native
    
    /* CompleteClass */
    override def setFilterByMatch(regexes: js.Array[js.RegExp]): Unit = js.native
    
    /* CompleteClass */
    override def setFilterByTag(tags: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def shouldInclude(entry: Entry): Boolean = js.native
  }
  
  trait IosFilter
    extends StObject
       with IFilter {
    
    /* private */ var filter: Any
    
    /* private */ val minPriority: Any
    
    def setFilterByMatch(regexes: js.Array[js.RegExp]): Unit
    
    def setFilterByTag(tags: js.Array[String]): Unit
  }
  object IosFilter {
    
    inline def apply(
      filter: Any,
      minPriority: Any,
      setFilterByMatch: js.Array[js.RegExp] => Unit,
      setFilterByTag: js.Array[String] => Unit,
      shouldInclude: Entry => Boolean
    ): IosFilter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], minPriority = minPriority.asInstanceOf[js.Any], setFilterByMatch = js.Any.fromFunction1(setFilterByMatch), setFilterByTag = js.Any.fromFunction1(setFilterByTag), shouldInclude = js.Any.fromFunction1(shouldInclude))
      __obj.asInstanceOf[IosFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IosFilter] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setMinPriority(value: Any): Self = StObject.set(x, "minPriority", value.asInstanceOf[js.Any])
      
      inline def setSetFilterByMatch(value: js.Array[js.RegExp] => Unit): Self = StObject.set(x, "setFilterByMatch", js.Any.fromFunction1(value))
      
      inline def setSetFilterByTag(value: js.Array[String] => Unit): Self = StObject.set(x, "setFilterByTag", js.Any.fromFunction1(value))
    }
  }
}
