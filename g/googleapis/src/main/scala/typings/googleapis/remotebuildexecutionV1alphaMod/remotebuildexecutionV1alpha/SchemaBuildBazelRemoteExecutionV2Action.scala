package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `Action` captures all the information about an execution which is
  * required to reproduce it.  `Action`s are the core component of the
  * [Execution] service. A single `Action` represents a repeatable action that
  * can be performed by the execution service. `Action`s can be succinctly
  * identified by the digest of their wire format encoding and, once an
  * `Action` has been executed, will be cached in the action cache. Future
  * requests can then use the cached result rather than needing to run afresh.
  * When a server completes execution of an Action, it MAY choose to cache the
  * result in the ActionCache unless `do_not_cache` is `true`. Clients SHOULD
  * expect the server to do so. By default, future calls to Execute the same
  * `Action` will also serve their results from the cache. Clients must take
  * care to understand the caching behaviour. Ideally, all `Action`s will be
  * reproducible so that serving a result from cache is always desirable and
  * correct.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2Action extends StObject {
  
  /**
    * The digest of the Command to run, which MUST be present in the
    * ContentAddressableStorage.
    */
  var commandDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  
  /**
    * If true, then the `Action`&#39;s result cannot be cached.
    */
  var doNotCache: js.UndefOr[Boolean] = js.native
  
  /**
    * The digest of the root Directory for the input files. The files in the
    * directory tree are available in the correct location on the build machine
    * before the command is executed. The root directory, as well as every
    * subdirectory and content blob referred to, MUST be in the
    * ContentAddressableStorage.
    */
  var inputRootDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  
  /**
    * A timeout after which the execution should be killed. If the timeout is
    * absent, then the client is specifying that the execution should continue
    * as long as the server will let it. The server SHOULD impose a timeout if
    * the client does not specify one, however, if the client does specify a
    * timeout that is longer than the server&#39;s maximum timeout, the server
    * MUST reject the request.  The timeout is a part of the Action message,
    * and therefore two `Actions` with different timeouts are different, even
    * if they are otherwise identical. This is because, if they were not,
    * running an `Action` with a lower timeout than is required might result in
    * a cache hit from an execution run with a longer timeout, hiding the fact
    * that the timeout is too short. By encoding it directly in the `Action`, a
    * lower timeout will result in a cache miss and the execution timeout will
    * fail immediately, rather than whenever the cache entry gets evicted.
    */
  var timeout: js.UndefOr[String] = js.native
}
object SchemaBuildBazelRemoteExecutionV2Action {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Action]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ActionMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "commandDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandDigestUndefined: Self = StObject.set(x, "commandDigest", js.undefined)
    
    @scala.inline
    def setDoNotCache(value: Boolean): Self = StObject.set(x, "doNotCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotCacheUndefined: Self = StObject.set(x, "doNotCache", js.undefined)
    
    @scala.inline
    def setInputRootDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "inputRootDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputRootDigestUndefined: Self = StObject.set(x, "inputRootDigest", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
