package typings.jsDashGit.JSGit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DB extends js.Object {
  /**
  		 * This is for when the user wants to delete or otherwise reclaim your database's resources.
  		 */
  def clear(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  /**
  		 * Remove an object or ref from the database.
  		 */
  def del(key: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit
  /**
  		 * Load a ref or object from the database.
  		 * The database should assume that keys that are 40-character long hex strings are sha1 hashes. The value for these will always be binary (Buffer in node, Uint8Array in browser) All other keys are paths like refs/heads/master or HEAD and the value is a string.
  		 */
  def get(key: String, callback: js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]): Unit
  /**
  		 * Check if a key is in the database
  		 */
  def has(key: String, callback: js.Function2[/* err */ js.Any, /* hasKey */ Boolean, Unit]): Unit
  /**
  		 * Initialize a database. This is where you db implementation can setup stuff.
  		 */
  def init(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  /**
  		 * Given a path prefix, give all the keys. This is like a readdir if you treat the keys as paths.
  		 * For example, given the keys refs/heads/master, refs/heads/experimental, refs/tags/0.1.3 and the prefix refs/heads/, the output would be master and experimental.
  		 * A null prefix returns all non hash keys.
  		 */
  def keys(prefix: String, callback: js.Function2[/* err */ js.Any, /* keys */ js.Array[String], Unit]): Unit
  /**
  		 * Save a value to the database. Same rules apply about hash keys being binary values and other keys being string values.
  		 */
  def set(key: String, value: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): Unit
}

object DB {
  @scala.inline
  def apply(
    clear: js.Function1[/* err */ js.Any, Unit] => Unit,
    del: (String, js.Function1[/* err */ js.Any, Unit]) => Unit,
    get: (String, js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]) => Unit,
    has: (String, js.Function2[/* err */ js.Any, /* hasKey */ Boolean, Unit]) => Unit,
    init: js.Function1[/* err */ js.Any, Unit] => Unit,
    keys: (String, js.Function2[/* err */ js.Any, /* keys */ js.Array[String], Unit]) => Unit,
    set: (String, js.Any, js.Function1[/* err */ js.Any, Unit]) => Unit
  ): DB = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), del = js.Any.fromFunction2(del), get = js.Any.fromFunction2(get), has = js.Any.fromFunction2(has), init = js.Any.fromFunction1(init), keys = js.Any.fromFunction2(keys), set = js.Any.fromFunction3(set))
  
    __obj.asInstanceOf[DB]
  }
}

