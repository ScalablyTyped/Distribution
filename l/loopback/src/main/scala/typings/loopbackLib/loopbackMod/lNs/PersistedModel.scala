package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
       * Extends Model with basic query and CRUD support
       * **Change Event*
       * Listen for model changes using the `change` event
       * ```js
       * MyPersistedModel.on('changed', function(obj)
       *    console.log(obj) // => the changed model
       * });
       * ```
       * @class PersistedModel
       */
@js.native
trait PersistedModel extends Model {
  /**
               * Deletes the model from persistence.
               * Triggers `destroy` hook (async) before and after destroying object.
               */
  def destroy(): js.Promise[scala.Unit] = js.native
  /**
               * Deletes the model from persistence.
               * Triggers `destroy` hook (async) before and after destroying object.
               * @param {() => void} callback Callback function
               */
  def destroy(callback: CallbackWithoutResult): scala.Unit = js.native
  /**
               * Get the `id` value for the `PersistedModel`
               * @returns {*} The `id` valu
               */
  def getId(): js.Any = js.native
  /**
               * Get the `id` property name of the constructor
               * @returns {string} The `id` property nam
               */
  def getIdName(): java.lang.String = js.native
  /**
               * Determine if the data model is new.
               * @returns {boolean} Returns true if the data model is new; false otherwise
               */
  def isNewRecord(): scala.Boolean = js.native
  /**
               * Reload object from persistence.  Requires `id` member of `object` to be able to call `find`.
               */
  def reload[T](): js.Promise[T] = js.native
  /**
               * Reload object from persistence.  Requires `id` member of `object` to be able to call `find`.
               * @callback {() => void} callback Callback function called with `(err, instance)` arguments.  Required.
               * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
               * @param {any} instance Model instance
               */
  def reload[T](callback: CallbackWithResult[T]): scala.Unit = js.native
  /**
               * Replace attributes for a model instance and persist it into the datasource.
               * Performs validation before replacing
               * @param {any} data Data to replace.
               * @options {any} [options] Options for replace
               * @property {boolean} validate Perform validation before saving.  Default is true.
               */
  def replaceAttributes[T](data: js.Any): js.Promise[T] = js.native
  /**
               * Replace attributes for a model instance and persist it into the datasource.
               * Performs validation before replacing
               * @param {any} data Data to replace.
               * @callback {() => void} callback Callback function called with `(err, instance)` arguments.
               * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
               * @param {any} instance Replaced instance
               */
  def replaceAttributes[T](data: js.Any, callback: CallbackWithResult[T]): scala.Unit = js.native
  /**
               * Replace attributes for a model instance and persist it into the datasource.
               * Performs validation before replacing
               * @param {any} data Data to replace.
               * @options {any} [options] Options for replace
               * @property {boolean} validate Perform validation before saving.  Default is true.
               */
  def replaceAttributes[T](data: js.Any, options: loopbackLib.Anon_Validate): js.Promise[T] = js.native
  /**
               * Replace attributes for a model instance and persist it into the datasource.
               * Performs validation before replacing
               * @param {any} data Data to replace.
               * @options {any} [options] Options for replace
               * @property {boolean} validate Perform validation before saving.  Default is true.
               * @callback {() => void} callback Callback function called with `(err, instance)` arguments.
               * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
               * @param {any} instance Replaced instance
               */
  def replaceAttributes[T](data: js.Any, options: loopbackLib.Anon_Validate, callback: CallbackWithResult[T]): scala.Unit = js.native
  /**
               * Save model instance. If the instance doesn't have an ID, then calls [create](#persistedmodelcreatedata-cb) instead.
               * Triggers: validate, save, update, or create.
               * @options {any} [options] See below.
               * @property {boolean} validate Perform validation before saving.  Default is true.
               * @property {boolean} throws If true, throw a validation error; WARNING: This can crash Node.
               * If false, report the error via callback.  Default is false.
               */
  def save[T](): js.Promise[T] = js.native
  /**
               * Save model instance. If the instance doesn't have an ID, then calls [create](#persistedmodelcreatedata-cb) instead.
               * Triggers: validate, save, update, or create.
               * @callback {() => void} callback Optional callback function called with `(err, obj)` arguments.
               * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
               * @param {any} instance Model instance saved or created
               */
  def save[T](callback: CallbackWithResult[T]): scala.Unit = js.native
  /**
               * Save model instance. If the instance doesn't have an ID, then calls [create](#persistedmodelcreatedata-cb) instead.
               * Triggers: validate, save, update, or create.
               * @options {any} [options] See below.
               * @property {boolean} validate Perform validation before saving.  Default is true.
               * @property {boolean} throws If true, throw a validation error; WARNING: This can crash Node.
               * If false, report the error via callback.  Default is false.
               */
  def save[T](options: loopbackLib.Anon_Throws): js.Promise[T] = js.native
  /**
               * Save model instance. If the instance doesn't have an ID, then calls [create](#persistedmodelcreatedata-cb) instead.
               * Triggers: validate, save, update, or create.
               * @options {any} [options] See below.
               * @property {boolean} validate Perform validation before saving.  Default is true.
               * @property {boolean} throws If true, throw a validation error; WARNING: This can crash Node.
               * If false, report the error via callback.  Default is false.
               * @callback {() => void} callback Optional callback function called with `(err, obj)` arguments.
               * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
               * @param {any} instance Model instance saved or created
               */
  def save[T](options: loopbackLib.Anon_Throws, callback: CallbackWithResult[T]): scala.Unit = js.native
  /**
               * Set the correct `id` property for the `PersistedModel`. Uses the `setId` method if the model is attached to
               * connector that defines it.  Otherwise, uses the default lookup.
               * Override this method to handle complex IDs
               * @param {*} val The `id` value. Will be converted to the type that the `id` property specifies
               */
  def setId(`val`: js.Any): scala.Unit = js.native
  /**
               * Update a single attribute.
               * Equivalent to `updateAttributes({name: 'value'}, cb)
               * @param {string} name Name of property.
               * @param {any} value Value of property.
               */
  def updateAttribute[T](name: java.lang.String, value: js.Any): js.Promise[T] = js.native
  /**
               * Update a single attribute.
               * Equivalent to `updateAttributes({name: 'value'}, cb)
               * @param {string} name Name of property.
               * @param {any} value Value of property.
               * @callback {() => void} callback Callback function called with `(err, instance)` arguments.  Required.
               * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
               * @param {any} instance Updated instance
               */
  def updateAttribute[T](name: java.lang.String, value: js.Any, callback: CallbackWithResult[T]): scala.Unit = js.native
  /**
               * Update set of attributes.  Performs validation before updating
               * Triggers: `validation`, `save` and `update` hooks
               * @param {any} data Data to update.
               */
  def updateAttributes[T](data: js.Any): js.Promise[T] = js.native
  /**
               * Update set of attributes.  Performs validation before updating
               * Triggers: `validation`, `save` and `update` hooks
               * @param {any} data Data to update.
               * @callback {() => void} callback Callback function called with `(err, instance)` arguments.  Required.
               * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
               * @param {any} instance Updated instance
               */
  def updateAttributes[T](data: js.Any, callback: CallbackWithResult[T]): scala.Unit = js.native
}

