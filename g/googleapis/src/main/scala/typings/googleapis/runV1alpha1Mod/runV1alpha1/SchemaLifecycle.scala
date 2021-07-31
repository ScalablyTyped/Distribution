package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lifecycle describes actions that the management system should take in
  * response to container lifecycle events. For the PostStart and PreStop
  * lifecycle handlers, management of the container blocks until the action is
  * complete, unless the container process fails, in which case the handler is
  * aborted.
  */
trait SchemaLifecycle extends StObject {
  
  /**
    * PostStart is called immediately after a container is created. If the
    * handler fails, the container is terminated and restarted according to its
    * restart policy. Other management of the container blocks until the hook
    * completes. More info:
    * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    * +optional
    */
  var postStart: js.UndefOr[SchemaHandler] = js.undefined
  
  /**
    * PreStop is called immediately before a container is terminated. The
    * container is terminated after the handler completes. The reason for
    * termination is passed to the handler. Regardless of the outcome of the
    * handler, the container is eventually terminated. Other management of the
    * container blocks until the hook completes. More info:
    * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    * +optional
    */
  var preStop: js.UndefOr[SchemaHandler] = js.undefined
}
object SchemaLifecycle {
  
  @scala.inline
  def apply(): SchemaLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLifecycle]
  }
  
  @scala.inline
  implicit class SchemaLifecycleMutableBuilder[Self <: SchemaLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostStart(value: SchemaHandler): Self = StObject.set(x, "postStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostStartUndefined: Self = StObject.set(x, "postStart", js.undefined)
    
    @scala.inline
    def setPreStop(value: SchemaHandler): Self = StObject.set(x, "preStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreStopUndefined: Self = StObject.set(x, "preStop", js.undefined)
  }
}
