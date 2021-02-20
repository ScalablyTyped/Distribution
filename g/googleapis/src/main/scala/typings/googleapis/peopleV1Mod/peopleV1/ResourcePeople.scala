package typings.googleapis.peopleV1Mod.peopleV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$People")
@js.native
class ResourcePeople protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var connections: ResourcePeopleConnections = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * people.people.createContact
    * @desc Create a new contact and return the person resource for that
    * contact.
    * @alias people.people.createContact
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parent The resource name of the owning person resource.
    * @param {().Person} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createContact(): GaxiosPromise[SchemaPerson] = js.native
  def createContact(callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def createContact(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def createContact(params: ParamsResourcePeopleCreatecontact): GaxiosPromise[SchemaPerson] = js.native
  def createContact(params: ParamsResourcePeopleCreatecontact, callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def createContact(
    params: ParamsResourcePeopleCreatecontact,
    options: BodyResponseCallback[SchemaPerson],
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  def createContact(params: ParamsResourcePeopleCreatecontact, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def createContact(
    params: ParamsResourcePeopleCreatecontact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  
  /**
    * people.people.deleteContact
    * @desc Delete a contact person. Any non-contact data will not be deleted.
    * @alias people.people.deleteContact
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName The resource name of the contact to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteContact(): GaxiosPromise[SchemaEmpty] = js.native
  def deleteContact(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteContact(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteContact(params: ParamsResourcePeopleDeletecontact): GaxiosPromise[SchemaEmpty] = js.native
  def deleteContact(params: ParamsResourcePeopleDeletecontact, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteContact(
    params: ParamsResourcePeopleDeletecontact,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def deleteContact(params: ParamsResourcePeopleDeletecontact, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteContact(
    params: ParamsResourcePeopleDeletecontact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * people.people.get
    * @desc Provides information about a person by specifying a resource name.
    * Use `people/me` to indicate the authenticated user. <br> The request
    * throws a 400 error if 'personFields' is not specified.
    * @alias people.people.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.personFields **Required.** A field mask to restrict which fields on the person are returned. Multiple fields can be specified by separating them with commas. Valid values are:  * addresses * ageRanges * biographies * birthdays * braggingRights * coverPhotos * emailAddresses * events * genders * imClients * interests * locales * memberships * metadata * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * relationshipInterests * relationshipStatuses * residences * sipAddresses * skills * taglines * urls * userDefined
    * @param {string=} params.requestMask.includeField **Required.** Comma-separated list of person fields to be included in the response. Each path should start with `person.`: for example, `person.names` or `person.photos`.
    * @param {string} params.resourceName The resource name of the person to provide information about.  - To get information about the authenticated user, specify `people/me`. - To get information about a google account, specify  `people/`<var>account_id</var>. - To get information about a contact, specify the resource name that   identifies the contact as returned by [`people.connections.list`](/people/api/rest/v1/people.connections/list).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPerson] = js.native
  def get(callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def get(params: ParamsResourcePeopleGet): GaxiosPromise[SchemaPerson] = js.native
  def get(params: ParamsResourcePeopleGet, callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: BodyResponseCallback[SchemaPerson],
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  def get(params: ParamsResourcePeopleGet, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  
  /**
    * people.people.getBatchGet
    * @desc Provides information about a list of specific people by specifying
    * a list of requested resource names. Use `people/me` to indicate the
    * authenticated user. <br> The request throws a 400 error if 'personFields'
    * is not specified.
    * @alias people.people.getBatchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.personFields **Required.** A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are:  * addresses * ageRanges * biographies * birthdays * braggingRights * coverPhotos * emailAddresses * events * genders * imClients * interests * locales * memberships * metadata * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * relationshipInterests * relationshipStatuses * residences * sipAddresses * skills * taglines * urls * userDefined
    * @param {string=} params.requestMask.includeField **Required.** Comma-separated list of person fields to be included in the response. Each path should start with `person.`: for example, `person.names` or `person.photos`.
    * @param {string=} params.resourceNames The resource names of the people to provide information about.  - To get information about the authenticated user, specify `people/me`. - To get information about a google account, specify   `people/`<var>account_id</var>. - To get information about a contact, specify the resource name that   identifies the contact as returned by [`people.connections.list`](/people/api/rest/v1/people.connections/list).  You can include up to 50 resource names in one request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getBatchGet(): GaxiosPromise[SchemaGetPeopleResponse] = js.native
  def getBatchGet(callback: BodyResponseCallback[SchemaGetPeopleResponse]): Unit = js.native
  def getBatchGet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetPeopleResponse] = js.native
  def getBatchGet(params: ParamsResourcePeopleGetbatchget): GaxiosPromise[SchemaGetPeopleResponse] = js.native
  def getBatchGet(params: ParamsResourcePeopleGetbatchget, callback: BodyResponseCallback[SchemaGetPeopleResponse]): Unit = js.native
  def getBatchGet(
    params: ParamsResourcePeopleGetbatchget,
    options: BodyResponseCallback[SchemaGetPeopleResponse],
    callback: BodyResponseCallback[SchemaGetPeopleResponse]
  ): Unit = js.native
  def getBatchGet(params: ParamsResourcePeopleGetbatchget, options: MethodOptions): GaxiosPromise[SchemaGetPeopleResponse] = js.native
  def getBatchGet(
    params: ParamsResourcePeopleGetbatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetPeopleResponse]
  ): Unit = js.native
  
  /**
    * people.people.updateContact
    * @desc Update contact data for an existing contact person. Any non-contact
    * data will not be modified.  The request throws a 400 error if
    * `updatePersonFields` is not specified. <br> The request throws a 400
    * error if `person.metadata.sources` is not specified for the contact to be
    * updated. <br> The request throws a 412 error if
    * `person.metadata.sources.etag` is different than the contact's etag,
    * which indicates the contact has changed since its data was read. Clients
    * should get the latest person and re-apply their updates to the latest
    * person.
    * @alias people.people.updateContact
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName The resource name for the person, assigned by the server. An ASCII string with a max length of 27 characters, in the form of `people/`<var>person_id</var>.
    * @param {string=} params.updatePersonFields **Required.** A field mask to restrict which fields on the person are updated. Multiple fields can be specified by separating them with commas. All updated fields will be replaced. Valid values are:  * addresses * biographies * birthdays * emailAddresses * events * genders * imClients * interests * locales * names * nicknames * occupations * organizations * phoneNumbers * relations * residences * sipAddresses * urls * userDefined
    * @param {().Person} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateContact(): GaxiosPromise[SchemaPerson] = js.native
  def updateContact(callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def updateContact(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def updateContact(params: ParamsResourcePeopleUpdatecontact): GaxiosPromise[SchemaPerson] = js.native
  def updateContact(params: ParamsResourcePeopleUpdatecontact, callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def updateContact(
    params: ParamsResourcePeopleUpdatecontact,
    options: BodyResponseCallback[SchemaPerson],
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  def updateContact(params: ParamsResourcePeopleUpdatecontact, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def updateContact(
    params: ParamsResourcePeopleUpdatecontact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
}
