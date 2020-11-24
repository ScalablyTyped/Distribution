package typings.levelTtl.mod

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("level-ttl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Augment levelup to handle a new 'ttl' option on put() and batch() that specifies
    * the number of milliseconds an entry should remain in the data store.
    * After the TTL, the entry will be automatically cleared for you.
    * @param db
    * @param opts
    * @see {@link https://github.com/level/level-ttl#usage level-ttl Usage}
    */
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]]): LevelTTL[K, V] = js.native
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]], opts: LevelTTLOptions): LevelTTL[K, V] = js.native
}
