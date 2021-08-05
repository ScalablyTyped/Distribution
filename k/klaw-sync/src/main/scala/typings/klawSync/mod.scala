package typings.klawSync

import typings.klawSync.anon.ReaddirSync
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(root: String): js.Array[Item] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[Item]]
  inline def apply(root: String, options: Options): js.Array[Item] = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
  
  @JSImport("klaw-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Filter = js.Function1[/* item */ Item, Boolean]
  
  trait Item extends StObject {
    
    var path: String
    
    var stats: Stats
  }
  object Item {
    
    inline def apply(path: String, stats: Stats): Item = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * @description The number of times to recurse before stopping.
      *              -1 for unlimited.
      * @default -1
      * @since v5.0.0
      */
    var depthLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * @description function that gets one argument fn({path: '', stats: {}}) and returns true to include
      *              or false to exclude the item
      * @since v2.0.0
      */
    var filter: js.UndefOr[Filter] = js.undefined
    
    /**
      * @description Custom fs, useful when mocking fs object.
      * @default graceful-fs
      * @since v4.0.0
      */
    var fs: js.UndefOr[ReaddirSync] = js.undefined
    
    /**
      * @description True to only return files (ignore directories).
      *              Defaults to false if not specified.
      * @default false
      */
    var nodir: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @description True to only return directories (ignore files).
      *              Defaults to false if not specified.
      * @default false
      */
    var nofile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @description traverse all subdirectories, regardless of `filter` option.
      *
      * When set to true, traverseAll produces similar behavior to the default
      * behavior prior to `v4.0.0`. The current default of `traverseAll: false`
      * is equivalent to the old `noRecurseOnFailedFilter: true`).
      *
      * @since v6.0.0
      */
    var traverseAll: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDepthLimit(value: Double): Self = StObject.set(x, "depthLimit", value.asInstanceOf[js.Any])
      
      inline def setDepthLimitUndefined: Self = StObject.set(x, "depthLimit", js.undefined)
      
      inline def setFilter(value: /* item */ Item => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFs(value: ReaddirSync): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      inline def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
      
      inline def setNofile(value: Boolean): Self = StObject.set(x, "nofile", value.asInstanceOf[js.Any])
      
      inline def setNofileUndefined: Self = StObject.set(x, "nofile", js.undefined)
      
      inline def setTraverseAll(value: Boolean): Self = StObject.set(x, "traverseAll", value.asInstanceOf[js.Any])
      
      inline def setTraverseAllUndefined: Self = StObject.set(x, "traverseAll", js.undefined)
    }
  }
}
