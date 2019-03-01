package typings
package hasherLib.hasherMod.HasherJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasherStatic extends js.Object {
  // <static> <constant> {string} hasher.VERSION
  // hasher Version Number
  var VERSION: java.lang.String
  // {string} hasher.appendHash
  // String that should always be added to the end of Hash value.
  var appendHash: java.lang.String
  // default value: '';
  // will be automatically removed from `hasher.getHash()`
  // avoid conflicts with elements that contain ID equal to hash value;
  // <static> {signals.Signal} hasher.changed
  // Signal dispatched when hash value changes. - pass current hash as 1st parameter to listeners and previous hash value as 2nd parameter.
  var changed: signalsLib.signalsMod.signalsNs.Signal[_]
  // <static> {signals.Signal} hasher.initialized
  // Signal dispatched when hasher is initialized. - pass current hash as first parameter to listeners.
  var initialized: signalsLib.signalsMod.signalsNs.Signal[_]
  // <static> {string} hasher.prependHash
  // String that should always be added to the beginning of Hash value.
  var prependHash: java.lang.String
  // default value: '/';
  // will be automatically removed from `hasher.getHash()`
  // avoid conflicts with elements that contain ID equal to hash value;
  // <static> {string} hasher.separator
  // String used to split hash paths; used by hasher.getHashAsArray() to split paths.
  var separator: java.lang.String
  // default value: '/';
  // <static> {signals.Signal} hasher.stopped
  // Signal dispatched when hasher is stopped. - pass current hash as first parameter to listeners
  var stopped: signalsLib.signalsMod.signalsNs.Signal[_]
  // Method Detail
  // <static> hasher.dispose()
  // Removes all event listeners, stops hasher and destroy hasher object. - IMPORTANT: hasher won't work after calling this method, hasher Object will be deleted.
  def dispose(): scala.Unit
  // <static> {string} hasher.getBaseURL()
  // Returns:
  // {string} Retrieve URL without query string and hash.
  def getBaseURL(): java.lang.String
  // <static> {string} hasher.getHash()
  // Returns:
  // {string} Hash value without '#', `hasher.appendHash` and `hasher.prependHash`.
  def getHash(): java.lang.String
  // <static> {Array.} hasher.getHashAsArray()
  // Returns:
  // {Array.} Hash value split into an Array.
  def getHashAsArray(): js.Array[java.lang.String]
  // <static> {string} hasher.getURL()
  // Returns:
  // {string} Full URL.
  def getURL(): java.lang.String
  // <static> hasher.init()
  // Start listening/dispatching changes in the hash/history.
  def init(): scala.Unit
  // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons before calling this method.
  // <static> {boolean} hasher.isActive()
  // Returns:
  // {boolean} If hasher is listening to changes on the browser history and/or hash value.
  def isActive(): scala.Boolean
  // <static> hasher.replaceHash(path)
  // Set Hash value without keeping previous hash on the history record. Similar to calling window.location.replace("#/hash") but will also work on IE6-7.
  // hasher.replaceHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
  // Parameters:
  // {...string} path
  // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
  def replaceHash(path: java.lang.String*): scala.Unit
  // <static> hasher.setHash(path)
  // Set Hash value, generating a new history record.
  // hasher.setHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
  // Parameters:
  // {...string} path
  // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
  def setHash(path: java.lang.String*): scala.Unit
  // <static> hasher.stop()
  // Stop listening/dispatching changes in the hash/history.
  // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons after calling this method, unless you call hasher.init() again.
  // hasher will still dispatch changes made programatically by calling hasher.setHash();
  def stop(): scala.Unit
}

object HasherStatic {
  @scala.inline
  def apply(
    VERSION: java.lang.String,
    appendHash: java.lang.String,
    changed: signalsLib.signalsMod.signalsNs.Signal[_],
    dispose: js.Function0[scala.Unit],
    getBaseURL: js.Function0[java.lang.String],
    getHash: js.Function0[java.lang.String],
    getHashAsArray: js.Function0[js.Array[java.lang.String]],
    getURL: js.Function0[java.lang.String],
    init: js.Function0[scala.Unit],
    initialized: signalsLib.signalsMod.signalsNs.Signal[_],
    isActive: js.Function0[scala.Boolean],
    prependHash: java.lang.String,
    replaceHash: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    separator: java.lang.String,
    setHash: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    stop: js.Function0[scala.Unit],
    stopped: signalsLib.signalsMod.signalsNs.Signal[_],
    toString: js.Function0[java.lang.String]
  ): HasherStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("VERSION")(VERSION)
    __obj.updateDynamic("appendHash")(appendHash)
    __obj.updateDynamic("changed")(changed)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getBaseURL")(getBaseURL)
    __obj.updateDynamic("getHash")(getHash)
    __obj.updateDynamic("getHashAsArray")(getHashAsArray)
    __obj.updateDynamic("getURL")(getURL)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("prependHash")(prependHash)
    __obj.updateDynamic("replaceHash")(replaceHash)
    __obj.updateDynamic("separator")(separator)
    __obj.updateDynamic("setHash")(setHash)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("stopped")(stopped)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[HasherStatic]
  }
}

