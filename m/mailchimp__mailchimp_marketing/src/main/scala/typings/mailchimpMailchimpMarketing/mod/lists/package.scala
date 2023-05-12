package typings.mailchimpMailchimpMarketing.mod.lists

import typings.mailchimpMailchimpMarketing.mod.ErrorResponse
import typings.mailchimpMailchimpMarketing.mod.lists.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Add a new member to the list.
  * @param listId The unique ID for the list.
  * @param body
  * @param opts Optional parameters
  * @param opts.skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
  * @return A {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ListMembers2}
  */
inline def addListMember(listId: String, body: AddListMemberBody): js.Promise[MembersSuccessResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListMember")(listId.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | ErrorResponse]]
inline def addListMember(listId: String, body: AddListMemberBody, opts: ListOptions): js.Promise[MembersSuccessResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListMember")(listId.asInstanceOf[js.Any], body.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | ErrorResponse]]

/**
  * Batch subscribe or unsubscribe
  * https://mailchimp.com/developer/marketing/api/lists/batch-subscribe-or-unsubscribe//
  * @param listId The unique ID for the list.
  * @param body
  * @param opts Optional parameters
  */
inline def batchListMembers(listId: String, body: BatchListMembersBody): js.Promise[BatchListMembersResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchListMembers")(listId.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BatchListMembersResponse | ErrorResponse]]
inline def batchListMembers(listId: String, body: BatchListMembersBody, opts: BatchListMembersOpts): js.Promise[BatchListMembersResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchListMembers")(listId.asInstanceOf[js.Any], body.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BatchListMembersResponse | ErrorResponse]]

/**
  * Archive list member
  * Archive a list member. To permanently delete, use the delete-permanent action.
  * @param listId The unique ID for the list.
  * @param subscriberHash The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
  * @return A {@link https://www.promisejs.org/|Promise}
  */
inline def deleteListMember(listId: String, subscriberHash: String): js.Promise[js.Object | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object | ErrorResponse]]

/**
  * Delete list member
  * Delete all personally identifiable information related to a list member, and remove them from a list. This will make it impossible to re-import the list member.
  * @param listId The unique ID for the list.
  * @param subscriberHash The MD5 hash of the lowercase version of the list member's email address.
  * @return A {@link https://www.promisejs.org/|Promise}
  */
inline def deleteListMemberPermanent(listId: String, subscriberHash: String): js.Promise[js.Object | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteListMemberPermanent")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object | ErrorResponse]]

/**
  * Get information about all lists in the account.
  * @param opts Optional parameters
  * @param opts.fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
  * @param opts.excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
  * @param opts.count The number of records to return. Default value is 10. Maximum value is 1000 (default to 10)
  * @param opts.offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination),
  * this it the number of records from a collection to skip. Default value is 0. (default to 0)
  * @param opts.beforeDateCreated Restrict response to lists created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
  * @param opts.sinceDateCreated Restrict results to lists created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
  * @param opts.beforeCampaignLastSent Restrict results to lists created before the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
  * @param opts.sinceCampaignLastSent Restrict results to lists created after the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
  * @param opts.email Restrict results to lists that include a specific subscriber's email address.
  * @param opts.sortField Returns files sorted by the specified field.
  * @param opts.sortDir Determines the order direction for sorted results.
  * @param opts.hasEcommerceStore Restrict results to lists that contain an active, connected, undeleted ecommerce store.
  * @param opts.includeTotalContacts Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state.
  * @return A {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/SubscriberLists}
  */
inline def getAllLists(): js.Promise[ListsSuccessResponse | ErrorResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllLists")().asInstanceOf[js.Promise[ListsSuccessResponse | ErrorResponse]]
inline def getAllLists(opts: ListOptions): js.Promise[ListsSuccessResponse | ErrorResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllLists")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListsSuccessResponse | ErrorResponse]]

/**
  * Get information about a specific list member, including a currently subscribed, unsubscribed, or bounced member.
  * @param listId The unique ID for the list.
  * @param subscriberHash The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
  * @param opts Optional parameters
  * @param opts.fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
  * @param opts.excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
  * @return A {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ListMembers2}
  */
inline def getListMember(listId: String, subscriberHash: String): js.Promise[MembersSuccessResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | ErrorResponse]]
inline def getListMember(listId: String, subscriberHash: String, opts: ListOptions): js.Promise[MembersSuccessResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | ErrorResponse]]

/**
  * Get the merge fields for a list.
  * @param listId The unique ID for the list.
  * @param opts Optional parameters
  * @param opts.fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
  * @param opts.excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
  * @param opts.count The number of records to return. Default value is 10. Maximum value is 1000 (default to 10)
  * @param opts.offset Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination),
  * this it the number of records from a collection to skip. Default value is 0. (default to 0)
  * @param opts.type The type of merge filed to return.
  * @param opts.required Whether to return required merge fields or not.
  * @return A {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MergeFieldSuccessResponse}
  */
inline def getListMergeFields(listId: String): js.Promise[MergeFieldSuccessResponse | ErrorResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getListMergeFields")(listId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MergeFieldSuccessResponse | ErrorResponse]]
inline def getListMergeFields(listId: String, opts: ListOptions): js.Promise[MergeFieldSuccessResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getListMergeFields")(listId.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MergeFieldSuccessResponse | ErrorResponse]]

/**
  * Add or update a list member.
  * @param listId The unique ID for the list.
  * @param subscriberHash The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
  * @param body
  * @param opts Optional parameters
  * @param opts.skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
  * @return A {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ListMembers2}
  */
inline def setListMember(listId: String, subscriberHash: String, body: SetListMemberBody): js.Promise[MembersSuccessResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("setListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | ErrorResponse]]
inline def setListMember(listId: String, subscriberHash: String, body: SetListMemberBody, opts: ListOptions): js.Promise[MembersSuccessResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("setListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | ErrorResponse]]

/**
  * Update information for a specific list member.
  * @param listId The unique ID for the list.
  * @param subscriberHash The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
  * @param body
  * @param opts Optional parameters
  * @param opts.skipMergeValidation If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
  * @return A {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ListMembers2}
  */
inline def updateListMember(listId: String, subscriberHash: String, body: UpdateListMemberBody): js.Promise[MembersSuccessResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | ErrorResponse]]
inline def updateListMember(listId: String, subscriberHash: String, body: UpdateListMemberBody, opts: ListOptions): js.Promise[MembersSuccessResponse | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateListMember")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MembersSuccessResponse | ErrorResponse]]

/**
  * Add or remove member tags
  * Add or remove tags from a list member. If a tag that does not exist is passed in and set as 'active', a new tag will be created.
  * @param listId The unique ID for the list.
  * @param subscriberHash The MD5 hash of the lowercase version of the list member's email address.
  * @param body
  * @return A {@link https://www.promisejs.org/|Promise}
  */
inline def updateListMemberTags(listId: String, subscriberHash: String, body: Any): js.Promise[js.Object | ErrorResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateListMemberTags")(listId.asInstanceOf[js.Any], subscriberHash.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object | ErrorResponse]]
