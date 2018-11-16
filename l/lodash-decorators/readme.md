```
/**
 * Binds methods of an object to the object itself, overwriting the existing method.
 * @export
 * @param {string[]} [methods=[]]
 * @returns {ClassDecorator}
 * @example
 *
 * @BindAll()
 * class MyClass {
 *   bound() {
 *     return this;
 *   }
 *
 *   unbound() {
 *     return this;
 *   }
 * }
 *
 * const myClass = new MyClass();
 *
 * myClass.bound.call(null); // => MyClass {}
 * myClass.unbound.call(null); // => MyClass {}
 */
/**
 * Mixins an object into the classes prototype.
 * @export
 * @param {...Object[]} srcs
 * @returns {ClassDecorator}
 * @example
 *
 * const myMixin = {
 *   blorg: () => 'blorg!'
 * }
 *
 * @Mixin(myMixin)
 * class MyClass {}
 *
 * const myClass = new MyClass();
 *
 * myClass.blorg(); // => 'blorg!'
 */
/**
 * A map for weakly holding nested references.
 * @private
 * @export
 * @class CompositeKeyWeakMap
 * @template T
 */
/**
 * Assigns all properties from an object to another object including non enumerable
 * properties.
 * @export
 * @template T
 * @template U
 * @param {T} to
 * @param {U} from
 * @param {string[]} [excludes=[]]
 * @returns {T}
 */
/**
 * Binds a function and copies metadata.
 * @private
 * @export
 * @param {Function} fn
 * @param {*} context
 * @returns {Function}
 */
/**
 * Used to copy over meta data from function to function.
 * If meta data is attached to a function. This can get lost
 * when wrapping functions. This tries to persist that.
 * @private
 */
/**
 * Creates a log message.
 * @private
 * @export
 * @param {string} [message='']
 * @returns {string}
 */
/**
  * Resolves a function on the current target object. It first will
  * try and resolve on the context object, then the target object,
  * then an error will be thrown if the method can not be resolved.
  * @private
  * @param {Function|string} method The method or method name.
  * @param {Object} [context] The context object to resolve from.
  * @param {Object} [target] The target object to resolve from.
  * @returns {Function} The resolved function.
  */
/**
 * Creates a function the returns the specific index.
 * @private
 * @export
 * @param {Function} fn
 * @param {number} index
 * @returns {Function}
 */
/**
 * Wraps a constructor in a wrapper function and copies all static properties
 * and methods to the new constructor.
 * @export
 * @param {Function} Ctor
 * @param {(Ctor: Function, ...args: any[]) => any} wrapper
 * @returns {Function}
 */
```