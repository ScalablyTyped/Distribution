package typings.hasher.mod.HasherJs

import typings.signals.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasherStatic extends js.Object {
  // <static> <constant> {string} hasher.VERSION
  // hasher Version Number
  var VERSION: String = js.native
  // {string} hasher.appendHash
  // String that should always be added to the end of Hash value.
  var appendHash: String = js.native
  // default value: '';
  // will be automatically removed from `hasher.getHash()`
  // avoid conflicts with elements that contain ID equal to hash value;
  // <static> {signals.Signal} hasher.changed
  // Signal dispatched when hash value changes. - pass current hash as 1st parameter to listeners and previous hash value as 2nd parameter.
  var changed: Signal[_] = js.native
  // <static> {signals.Signal} hasher.initialized
  // Signal dispatched when hasher is initialized. - pass current hash as first parameter to listeners.
  var initialized: Signal[_] = js.native
  // <static> {string} hasher.prependHash
  // String that should always be added to the beginning of Hash value.
  var prependHash: String = js.native
  // default value: '/';
  // will be automatically removed from `hasher.getHash()`
  // avoid conflicts with elements that contain ID equal to hash value;
  // <static> {string} hasher.separator
  // String used to split hash paths; used by hasher.getHashAsArray() to split paths.
  var separator: String = js.native
  // default value: '/';
  // <static> {signals.Signal} hasher.stopped
  // Signal dispatched when hasher is stopped. - pass current hash as first parameter to listeners
  var stopped: Signal[_] = js.native
  // Method Detail
  // <static> hasher.dispose()
  // Removes all event listeners, stops hasher and destroy hasher object. - IMPORTANT: hasher won't work after calling this method, hasher Object will be deleted.
  def dispose(): Unit = js.native
  // <static> {string} hasher.getBaseURL()
  // Returns:
  // {string} Retrieve URL without query string and hash.
  def getBaseURL(): String = js.native
  // <static> {string} hasher.getHash()
  // Returns:
  // {string} Hash value without '#', `hasher.appendHash` and `hasher.prependHash`.
  def getHash(): String = js.native
  // <static> {Array.} hasher.getHashAsArray()
  // Returns:
  // {Array.} Hash value split into an Array.
  def getHashAsArray(): js.Array[String] = js.native
  // <static> {string} hasher.getURL()
  // Returns:
  // {string} Full URL.
  def getURL(): String = js.native
  // <static> hasher.init()
  // Start listening/dispatching changes in the hash/history.
  def init(): Unit = js.native
  // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons before calling this method.
  // <static> {boolean} hasher.isActive()
  // Returns:
  // {boolean} If hasher is listening to changes on the browser history and/or hash value.
  def isActive(): Boolean = js.native
  // <static> hasher.replaceHash(path)
  // Set Hash value without keeping previous hash on the history record. Similar to calling window.location.replace("#/hash") but will also work on IE6-7.
  // hasher.replaceHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
  // Parameters:
  // {...string} path
  // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
  def replaceHash(path: String*): Unit = js.native
  // <static> hasher.setHash(path)
  // Set Hash value, generating a new history record.
  // hasher.setHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
  // Parameters:
  // {...string} path
  // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
  def setHash(path: String*): Unit = js.native
  // <static> hasher.stop()
  // Stop listening/dispatching changes in the hash/history.
  // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons after calling this method, unless you call hasher.init() again.
  // hasher will still dispatch changes made programatically by calling hasher.setHash();
  def stop(): Unit = js.native
}

object HasherStatic {
  @scala.inline
  def apply(
    VERSION: String,
    appendHash: String,
    changed: Signal[_],
    dispose: () => Unit,
    getBaseURL: () => String,
    getHash: () => String,
    getHashAsArray: () => js.Array[String],
    getURL: () => String,
    init: () => Unit,
    initialized: Signal[_],
    isActive: () => Boolean,
    prependHash: String,
    replaceHash: /* repeated */ String => Unit,
    separator: String,
    setHash: /* repeated */ String => Unit,
    stop: () => Unit,
    stopped: Signal[_]
  ): HasherStatic = {
    val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], appendHash = appendHash.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getBaseURL = js.Any.fromFunction0(getBaseURL), getHash = js.Any.fromFunction0(getHash), getHashAsArray = js.Any.fromFunction0(getHashAsArray), getURL = js.Any.fromFunction0(getURL), init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), prependHash = prependHash.asInstanceOf[js.Any], replaceHash = js.Any.fromFunction1(replaceHash), separator = separator.asInstanceOf[js.Any], setHash = js.Any.fromFunction1(setHash), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasherStatic]
  }
  @scala.inline
  implicit class HasherStaticOps[Self <: HasherStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVERSION(value: String): Self = this.set("VERSION", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppendHash(value: String): Self = this.set("appendHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setChanged(value: Signal[_]): Self = this.set("changed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBaseURL(value: () => String): Self = this.set("getBaseURL", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHash(value: () => String): Self = this.set("getHash", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHashAsArray(value: () => js.Array[String]): Self = this.set("getHashAsArray", js.Any.fromFunction0(value))
    @scala.inline
    def setGetURL(value: () => String): Self = this.set("getURL", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialized(value: Signal[_]): Self = this.set("initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    @scala.inline
    def setPrependHash(value: String): Self = this.set("prependHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceHash(value: /* repeated */ String => Unit): Self = this.set("replaceHash", js.Any.fromFunction1(value))
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetHash(value: /* repeated */ String => Unit): Self = this.set("setHash", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    @scala.inline
    def setStopped(value: Signal[_]): Self = this.set("stopped", value.asInstanceOf[js.Any])
  }
  
}

