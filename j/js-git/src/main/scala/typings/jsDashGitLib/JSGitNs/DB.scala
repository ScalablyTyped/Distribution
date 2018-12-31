package typings
package jsDashGitLib.JSGitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DB extends js.Object {
  /**
  		 * This is for when the user wants to delete or otherwise reclaim your database's resources.
  		 */
  def clear(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
  /**
  		 * Remove an object or ref from the database.
  		 */
  def del(key: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
  /**
  		 * Load a ref or object from the database.
  		 * The database should assume that keys that are 40-character long hex strings are sha1 hashes. The value for these will always be binary (Buffer in node, Uint8Array in browser) All other keys are paths like refs/heads/master or HEAD and the value is a string.
  		 */
  def get(key: java.lang.String, callback: js.Function2[/* err */ js.Any, /* value */ js.Any, scala.Unit]): scala.Unit
  /**
  		 * Check if a key is in the database
  		 */
  def has(
    key: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* hasKey */ scala.Boolean, scala.Unit]
  ): scala.Unit
  /**
  		 * Initialize a database. This is where you db implementation can setup stuff.
  		 */
  def init(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
  /**
  		 * Given a path prefix, give all the keys. This is like a readdir if you treat the keys as paths.
  		 * For example, given the keys refs/heads/master, refs/heads/experimental, refs/tags/0.1.3 and the prefix refs/heads/, the output would be master and experimental.
  		 * A null prefix returns all non hash keys.
  		 */
  def keys(
    prefix: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* keys */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit
  /**
  		 * Save a value to the database. Same rules apply about hash keys being binary values and other keys being string values.
  		 */
  def set(key: java.lang.String, value: js.Any, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
}

