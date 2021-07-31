package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDataproc.anon.Alt
import typings.maximMazurokGapiClientDataproc.anon.Callback
import typings.maximMazurokGapiClientDataproc.anon.Fields
import typings.maximMazurokGapiClientDataproc.anon.Key
import typings.maximMazurokGapiClientDataproc.anon.Oauthtoken
import typings.maximMazurokGapiClientDataproc.anon.Parent
import typings.maximMazurokGapiClientDataproc.anon.PrettyPrint
import typings.maximMazurokGapiClientDataproc.anon.QuotaUser
import typings.maximMazurokGapiClientDataproc.anon.RequestId
import typings.maximMazurokGapiClientDataproc.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTemplatesResource extends StObject {
  
  def create(request: Alt, body: WorkflowTemplate): Request[WorkflowTemplate] = js.native
  /** Creates new workflow template. */
  def create(request: Oauthtoken): Request[WorkflowTemplate] = js.native
  
  /** Deletes a workflow template. It does not cancel in-progress workflows. */
  def delete(): Request[js.Object] = js.native
  def delete(request: PrettyPrint): Request[js.Object] = js.native
  
  /** Retrieves the latest workflow template.Can retrieve previously instantiated template by specifying optional version parameter. */
  def get(): Request[WorkflowTemplate] = js.native
  def get(request: PrettyPrint): Request[WorkflowTemplate] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: Fields, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  def instantiate(request: Callback, body: InstantiateWorkflowTemplateRequest): Request[Operation] = js.native
  /**
    * Instantiates a template and begins execution.The returned Operation can be used to track execution of workflow by polling operations.get. The Operation will complete when entire
    * workflow is finished.The running workflow can be aborted via operations.cancel. This will cause any inflight jobs to be cancelled and workflow-owned clusters to be deleted.The
    * Operation.metadata will be WorkflowMetadata (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata). Also see Using WorkflowMetadata
    * (https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).On successful completion, Operation.response will be Empty.
    */
  def instantiate(request: QuotaUser): Request[Operation] = js.native
  
  /**
    * Instantiates a template and begins execution.This method is equivalent to executing the sequence CreateWorkflowTemplate, InstantiateWorkflowTemplate, DeleteWorkflowTemplate.The
    * returned Operation can be used to track execution of workflow by polling operations.get. The Operation will complete when entire workflow is finished.The running workflow can be
    * aborted via operations.cancel. This will cause any inflight jobs to be cancelled and workflow-owned clusters to be deleted.The Operation.metadata will be WorkflowMetadata
    * (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata). Also see Using WorkflowMetadata
    * (https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).On successful completion, Operation.response will be Empty.
    */
  def instantiateInline(request: Parent): Request[Operation] = js.native
  def instantiateInline(request: RequestId, body: WorkflowTemplate): Request[Operation] = js.native
  
  /** Lists workflows that match the specified filter in the request. */
  def list(): Request[ListWorkflowTemplatesResponse] = js.native
  def list(request: Key): Request[ListWorkflowTemplatesResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors. */
  def setIamPolicy(request: Fields, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Fields, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  def update(request: Callback, body: WorkflowTemplate): Request[WorkflowTemplate] = js.native
  /** Updates (replaces) workflow template. The updated template must contain version that matches the current server version. */
  def update(request: Resource): Request[WorkflowTemplate] = js.native
}
