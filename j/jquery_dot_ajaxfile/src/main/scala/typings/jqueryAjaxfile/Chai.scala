package typings.jqueryAjaxfile

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  @js.native
  trait Assert extends StObject {
    
    /**
      * @param expression Expression to test for truthiness.
      * @param message Message to display on error.
      */
    def apply(expression: js.Any): Unit = js.native
    def apply(expression: js.Any, message: String): Unit = js.native
    
    def Throw(fn: js.Function): Unit = js.native
    def Throw(fn: js.Function, errType: js.Function): Unit = js.native
    def Throw(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
    def Throw(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
    def Throw(fn: js.Function, msg: String): Unit = js.native
    def Throw(fn: js.Function, regExp: RegExp): Unit = js.native
    
    def closeTo(act: Double, exp: Double, delta: Double): Unit = js.native
    def closeTo(act: Double, exp: Double, delta: Double, msg: String): Unit = js.native
    
    def deepEqual(act: js.Any, exp: js.Any): Unit = js.native
    def deepEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
    
    def deepProperty(obj: Object, prop: String): Unit = js.native
    def deepProperty(obj: Object, prop: String, msg: String): Unit = js.native
    
    def deepPropertyNotVal(obj: Object, prop: String, `val`: js.Any): Unit = js.native
    def deepPropertyNotVal(obj: Object, prop: String, `val`: js.Any, msg: String): Unit = js.native
    
    def deepPropertyVal(obj: Object, prop: String, `val`: js.Any): Unit = js.native
    def deepPropertyVal(obj: Object, prop: String, `val`: js.Any, msg: String): Unit = js.native
    
    def doesNotThrow(fn: js.Function): Unit = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function): Unit = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
    def doesNotThrow(fn: js.Function, msg: String): Unit = js.native
    def doesNotThrow(fn: js.Function, regExp: RegExp): Unit = js.native
    
    def equal(act: js.Any, exp: js.Any): Unit = js.native
    def equal(act: js.Any, exp: js.Any, msg: String): Unit = js.native
    
    def fail(): Unit = js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.UndefOr[scala.Nothing],
      msg: js.UndefOr[scala.Nothing],
      operator: String
    ): Unit = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.UndefOr[scala.Nothing],
      msg: String,
      operator: String
    ): Unit = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): Unit = js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.Any,
      msg: js.UndefOr[scala.Nothing],
      operator: String
    ): Unit = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String): Unit = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, msg: String, operator: String): Unit = js.native
    def fail(actual: js.Any): Unit = js.native
    def fail(
      actual: js.Any,
      expected: js.UndefOr[scala.Nothing],
      msg: js.UndefOr[scala.Nothing],
      operator: String
    ): Unit = js.native
    def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], msg: String, operator: String): Unit = js.native
    def fail(actual: js.Any, expected: js.Any): Unit = js.native
    def fail(actual: js.Any, expected: js.Any, msg: js.UndefOr[scala.Nothing], operator: String): Unit = js.native
    def fail(actual: js.Any, expected: js.Any, msg: String): Unit = js.native
    def fail(actual: js.Any, expected: js.Any, msg: String, operator: String): Unit = js.native
    
    def ifError(`val`: js.Any): Unit = js.native
    def ifError(`val`: js.Any, msg: String): Unit = js.native
    
    def include(exp: String, inc: js.Any): Unit = js.native
    def include(exp: String, inc: js.Any, msg: String): Unit = js.native
    def include(exp: js.Array[_], inc: js.Any): Unit = js.native
    def include(exp: js.Array[_], inc: js.Any, msg: String): Unit = js.native
    
    def includeMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
    def includeMembers(set1: js.Array[_], set2: js.Array[_], msg: String): Unit = js.native
    
    def instanceOf(`val`: js.Any, `type`: js.Function): Unit = js.native
    def instanceOf(`val`: js.Any, `type`: js.Function, msg: String): Unit = js.native
    
    def isArray(`val`: js.Any): Unit = js.native
    def isArray(`val`: js.Any, msg: String): Unit = js.native
    
    def isBoolean(`val`: js.Any): Unit = js.native
    def isBoolean(`val`: js.Any, msg: String): Unit = js.native
    
    def isDefined(`val`: js.Any): Unit = js.native
    def isDefined(`val`: js.Any, msg: String): Unit = js.native
    
    def isFalse(`val`: js.Any): Unit = js.native
    def isFalse(`val`: js.Any, msg: String): Unit = js.native
    
    def isFunction(`val`: js.Any): Unit = js.native
    def isFunction(`val`: js.Any, msg: String): Unit = js.native
    
    def isNotArray(`val`: js.Any): Unit = js.native
    def isNotArray(`val`: js.Any, msg: String): Unit = js.native
    
    def isNotBoolean(`val`: js.Any): Unit = js.native
    def isNotBoolean(`val`: js.Any, msg: String): Unit = js.native
    
    def isNotFunction(`val`: js.Any): Unit = js.native
    def isNotFunction(`val`: js.Any, msg: String): Unit = js.native
    
    def isNotNull(`val`: js.Any): Unit = js.native
    def isNotNull(`val`: js.Any, msg: String): Unit = js.native
    
    def isNotNumber(`val`: js.Any): Unit = js.native
    def isNotNumber(`val`: js.Any, msg: String): Unit = js.native
    
    def isNotObject(`val`: js.Any): Unit = js.native
    def isNotObject(`val`: js.Any, msg: String): Unit = js.native
    
    def isNotString(`val`: js.Any): Unit = js.native
    def isNotString(`val`: js.Any, msg: String): Unit = js.native
    
    def isNull(`val`: js.Any): Unit = js.native
    def isNull(`val`: js.Any, msg: String): Unit = js.native
    
    def isNumber(`val`: js.Any): Unit = js.native
    def isNumber(`val`: js.Any, msg: String): Unit = js.native
    
    def isObject(`val`: js.Any): Unit = js.native
    def isObject(`val`: js.Any, msg: String): Unit = js.native
    
    def isString(`val`: js.Any): Unit = js.native
    def isString(`val`: js.Any, msg: String): Unit = js.native
    
    def isTrue(`val`: js.Any): Unit = js.native
    def isTrue(`val`: js.Any, msg: String): Unit = js.native
    
    def isUndefined(`val`: js.Any): Unit = js.native
    def isUndefined(`val`: js.Any, msg: String): Unit = js.native
    
    def lengthOf(exp: js.Any, len: Double): Unit = js.native
    def lengthOf(exp: js.Any, len: Double, msg: String): Unit = js.native
    
    def `match`(exp: js.Any, re: RegExp): Unit = js.native
    def `match`(exp: js.Any, re: RegExp, msg: String): Unit = js.native
    
    def notDeepEqual(act: js.Any, exp: js.Any): Unit = js.native
    def notDeepEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
    
    def notDeepProperty(obj: Object, prop: String): Unit = js.native
    def notDeepProperty(obj: Object, prop: String, msg: String): Unit = js.native
    
    def notEqual(act: js.Any, exp: js.Any): Unit = js.native
    def notEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
    
    def notInclude(exp: String, inc: js.Any): Unit = js.native
    def notInclude(exp: String, inc: js.Any, msg: String): Unit = js.native
    def notInclude(exp: js.Array[_], inc: js.Any): Unit = js.native
    def notInclude(exp: js.Array[_], inc: js.Any, msg: String): Unit = js.native
    
    def notInstanceOf(`val`: js.Any, `type`: js.Function): Unit = js.native
    def notInstanceOf(`val`: js.Any, `type`: js.Function, msg: String): Unit = js.native
    
    def notMatch(exp: js.Any, re: RegExp): Unit = js.native
    def notMatch(exp: js.Any, re: RegExp, msg: String): Unit = js.native
    
    def notOk(`val`: js.Any): Unit = js.native
    def notOk(`val`: js.Any, msg: String): Unit = js.native
    
    def notProperty(obj: Object, prop: String): Unit = js.native
    def notProperty(obj: Object, prop: String, msg: String): Unit = js.native
    
    def notStrictEqual(act: js.Any, exp: js.Any): Unit = js.native
    def notStrictEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
    
    def notTypeOf(`val`: js.Any, `type`: String): Unit = js.native
    def notTypeOf(`val`: js.Any, `type`: String, msg: String): Unit = js.native
    
    def ok(`val`: js.Any): Unit = js.native
    def ok(`val`: js.Any, msg: String): Unit = js.native
    
    def operator(`val`: js.Any, operator: String, val2: js.Any): Unit = js.native
    def operator(`val`: js.Any, operator: String, val2: js.Any, msg: String): Unit = js.native
    
    def property(obj: Object, prop: String): Unit = js.native
    def property(obj: Object, prop: String, msg: String): Unit = js.native
    
    def propertyNotVal(obj: Object, prop: String, `val`: js.Any): Unit = js.native
    def propertyNotVal(obj: Object, prop: String, `val`: js.Any, msg: String): Unit = js.native
    
    def propertyVal(obj: Object, prop: String, `val`: js.Any): Unit = js.native
    def propertyVal(obj: Object, prop: String, `val`: js.Any, msg: String): Unit = js.native
    
    def sameMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
    def sameMembers(set1: js.Array[_], set2: js.Array[_], msg: String): Unit = js.native
    
    def strictEqual(act: js.Any, exp: js.Any): Unit = js.native
    def strictEqual(act: js.Any, exp: js.Any, msg: String): Unit = js.native
    
    //alias frenzy
    def `throw`(fn: js.Function): Unit = js.native
    def `throw`(fn: js.Function, errType: js.Function): Unit = js.native
    def `throw`(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
    def `throw`(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
    def `throw`(fn: js.Function, msg: String): Unit = js.native
    def `throw`(fn: js.Function, regExp: RegExp): Unit = js.native
    
    def throws(fn: js.Function): Unit = js.native
    def throws(fn: js.Function, errType: js.Function): Unit = js.native
    def throws(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
    def throws(fn: js.Function, errType: js.Function, regExp: RegExp): Unit = js.native
    def throws(fn: js.Function, msg: String): Unit = js.native
    def throws(fn: js.Function, regExp: RegExp): Unit = js.native
    
    def typeOf(`val`: js.Any, `type`: String): Unit = js.native
    def typeOf(`val`: js.Any, `type`: String, msg: String): Unit = js.native
  }
  
  type AssertStatic = Assert
  
  @js.native
  trait Assertion
    extends LanguageChains
       with NumericComparison
       with TypeComparison {
    
    def Arguments(`type`: String): Assertion = js.native
    def Arguments(`type`: String, message: String): Assertion = js.native
    @JSName("Arguments")
    var Arguments_Original: Assertion = js.native
    
    def Throw(): Assertion = js.native
    def Throw(constructor: js.Function): Assertion = js.native
    def Throw(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def Throw(constructor: js.Function, expected: String): Assertion = js.native
    def Throw(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def Throw(constructor: js.Function, expected: RegExp): Assertion = js.native
    def Throw(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
    def Throw(constructor: Error): Assertion = js.native
    def Throw(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def Throw(constructor: Error, expected: String): Assertion = js.native
    def Throw(constructor: Error, expected: String, message: String): Assertion = js.native
    def Throw(constructor: Error, expected: RegExp): Assertion = js.native
    def Throw(constructor: Error, expected: RegExp, message: String): Assertion = js.native
    def Throw(expected: String): Assertion = js.native
    def Throw(expected: String, message: String): Assertion = js.native
    def Throw(expected: RegExp): Assertion = js.native
    def Throw(expected: RegExp, message: String): Assertion = js.native
    @JSName("Throw")
    var Throw_Original: Throw = js.native
    
    def a(`type`: String): Assertion = js.native
    def a(`type`: String, message: String): Assertion = js.native
    @JSName("a")
    var a_Original: TypeComparison = js.native
    
    def an(`type`: String): Assertion = js.native
    def an(`type`: String, message: String): Assertion = js.native
    @JSName("an")
    var an_Original: TypeComparison = js.native
    
    def arguments(`type`: String): Assertion = js.native
    def arguments(`type`: String, message: String): Assertion = js.native
    @JSName("arguments")
    var arguments_Original: Assertion = js.native
    
    def closeTo(expected: Double, delta: Double): Assertion = js.native
    def closeTo(expected: Double, delta: Double, message: String): Assertion = js.native
    
    def contain(value: String): Assertion = js.native
    def contain(value: String, message: String): Assertion = js.native
    def contain(value: Double): Assertion = js.native
    def contain(value: Double, message: String): Assertion = js.native
    def contain(value: Object): Assertion = js.native
    def contain(value: Object, message: String): Assertion = js.native
    @JSName("contain")
    var contain_Original: Include = js.native
    
    var deep: Deep = js.native
    
    def empty(`type`: String): Assertion = js.native
    def empty(`type`: String, message: String): Assertion = js.native
    @JSName("empty")
    var empty_Original: Assertion = js.native
    
    def eq(value: js.Any): Assertion = js.native
    def eq(value: js.Any, message: String): Assertion = js.native
    @JSName("eq")
    var eq_Original: Equal = js.native
    
    def eql(value: js.Any): Assertion = js.native
    def eql(value: js.Any, message: String): Assertion = js.native
    @JSName("eql")
    var eql_Original: Equal = js.native
    
    def eqls(value: js.Any): Assertion = js.native
    def eqls(value: js.Any, message: String): Assertion = js.native
    @JSName("eqls")
    var eqls_Original: Equal = js.native
    
    def equal(value: js.Any): Assertion = js.native
    def equal(value: js.Any, message: String): Assertion = js.native
    @JSName("equal")
    var equal_Original: Equal = js.native
    
    def equals(value: js.Any): Assertion = js.native
    def equals(value: js.Any, message: String): Assertion = js.native
    @JSName("equals")
    var equals_Original: Equal = js.native
    
    def exist(`type`: String): Assertion = js.native
    def exist(`type`: String, message: String): Assertion = js.native
    @JSName("exist")
    var exist_Original: Assertion = js.native
    
    def `false`(`type`: String): Assertion = js.native
    def `false`(`type`: String, message: String): Assertion = js.native
    @JSName("false")
    var false_Original: Assertion = js.native
    
    def haveOwnProperty(name: String): Assertion = js.native
    def haveOwnProperty(name: String, message: String): Assertion = js.native
    @JSName("haveOwnProperty")
    var haveOwnProperty_Original: OwnProperty = js.native
    
    def include(value: String): Assertion = js.native
    def include(value: String, message: String): Assertion = js.native
    def include(value: Double): Assertion = js.native
    def include(value: Double, message: String): Assertion = js.native
    def include(value: Object): Assertion = js.native
    def include(value: Object, message: String): Assertion = js.native
    @JSName("include")
    var include_Original: Include = js.native
    
    def itself(`type`: String): Assertion = js.native
    def itself(`type`: String, message: String): Assertion = js.native
    @JSName("itself")
    var itself_Original: Assertion = js.native
    
    def key(string: String): Assertion = js.native
    
    def keys(keys: String*): Assertion = js.native
    def keys(keys: js.Array[_]): Assertion = js.native
    @JSName("keys")
    var keys_Original: Keys = js.native
    
    def length(length: Double): Assertion = js.native
    def length(length: Double, message: String): Assertion = js.native
    
    def lengthOf(length: Double): Assertion = js.native
    def lengthOf(length: Double, message: String): Assertion = js.native
    @JSName("lengthOf")
    var lengthOf_Original: Length = js.native
    
    @JSName("length")
    var length_Original: Length = js.native
    
    def `match`(regexp: String): Assertion = js.native
    def `match`(regexp: String, message: String): Assertion = js.native
    def `match`(regexp: RegExp): Assertion = js.native
    def `match`(regexp: RegExp, message: String): Assertion = js.native
    
    def members(set: js.Array[_]): Assertion = js.native
    def members(set: js.Array[_], message: String): Assertion = js.native
    @JSName("members")
    var members_Original: Members = js.native
    
    def not(`type`: String): Assertion = js.native
    def not(`type`: String, message: String): Assertion = js.native
    @JSName("not")
    var not_Original: Assertion = js.native
    
    def `null`(`type`: String): Assertion = js.native
    def `null`(`type`: String, message: String): Assertion = js.native
    @JSName("null")
    var null_Original: Assertion = js.native
    
    def ok(`type`: String): Assertion = js.native
    def ok(`type`: String, message: String): Assertion = js.native
    @JSName("ok")
    var ok_Original: Assertion = js.native
    
    def ownProperty(name: String): Assertion = js.native
    def ownProperty(name: String, message: String): Assertion = js.native
    @JSName("ownProperty")
    var ownProperty_Original: OwnProperty = js.native
    
    def property(name: String): Assertion = js.native
    def property(name: String, value: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def property(name: String, value: js.Any): Assertion = js.native
    def property(name: String, value: js.Any, message: String): Assertion = js.native
    @JSName("property")
    var property_Original: Property = js.native
    
    def respondTo(method: String): Assertion = js.native
    def respondTo(method: String, message: String): Assertion = js.native
    
    def satisfy(matcher: js.Function): Assertion = js.native
    def satisfy(matcher: js.Function, message: String): Assertion = js.native
    
    def string(string: String): Assertion = js.native
    def string(string: String, message: String): Assertion = js.native
    
    def `throw`(): Assertion = js.native
    def `throw`(constructor: js.Function): Assertion = js.native
    def `throw`(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def `throw`(constructor: js.Function, expected: String): Assertion = js.native
    def `throw`(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def `throw`(constructor: js.Function, expected: RegExp): Assertion = js.native
    def `throw`(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
    def `throw`(constructor: Error): Assertion = js.native
    def `throw`(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def `throw`(constructor: Error, expected: String): Assertion = js.native
    def `throw`(constructor: Error, expected: String, message: String): Assertion = js.native
    def `throw`(constructor: Error, expected: RegExp): Assertion = js.native
    def `throw`(constructor: Error, expected: RegExp, message: String): Assertion = js.native
    def `throw`(expected: String): Assertion = js.native
    def `throw`(expected: String, message: String): Assertion = js.native
    def `throw`(expected: RegExp): Assertion = js.native
    def `throw`(expected: RegExp, message: String): Assertion = js.native
    @JSName("throw")
    var throw_Original: Throw = js.native
    
    def throws(): Assertion = js.native
    def throws(constructor: js.Function): Assertion = js.native
    def throws(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def throws(constructor: js.Function, expected: String): Assertion = js.native
    def throws(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def throws(constructor: js.Function, expected: RegExp): Assertion = js.native
    def throws(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
    def throws(constructor: Error): Assertion = js.native
    def throws(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def throws(constructor: Error, expected: String): Assertion = js.native
    def throws(constructor: Error, expected: String, message: String): Assertion = js.native
    def throws(constructor: Error, expected: RegExp): Assertion = js.native
    def throws(constructor: Error, expected: RegExp, message: String): Assertion = js.native
    def throws(expected: String): Assertion = js.native
    def throws(expected: String, message: String): Assertion = js.native
    def throws(expected: RegExp): Assertion = js.native
    def throws(expected: RegExp, message: String): Assertion = js.native
    @JSName("throws")
    var throws_Original: Throw = js.native
    
    def `true`(`type`: String): Assertion = js.native
    def `true`(`type`: String, message: String): Assertion = js.native
    @JSName("true")
    var true_Original: Assertion = js.native
    
    def undefined(`type`: String): Assertion = js.native
    def undefined(`type`: String, message: String): Assertion = js.native
    @JSName("undefined")
    var undefined_Original: Assertion = js.native
  }
  
  @js.native
  trait AssertionError extends StObject {
    
    var message: String = js.native
    
    var name: String = js.native
    
    var showDiff: Boolean = js.native
    
    var stack: String = js.native
  }
  object AssertionError {
    
    @scala.inline
    def apply(message: String, name: String, showDiff: Boolean, stack: String): AssertionError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionError]
    }
    
    @scala.inline
    implicit class AssertionErrorMutableBuilder[Self <: AssertionError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDiff(value: Boolean): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  type AssertionStatic = js.Function2[/* target */ js.Any, /* message */ js.UndefOr[String], Assertion]
  
  @js.native
  trait ChaiStatic extends StObject {
    
    /**
      * @param expression Expression to test for truthiness.
      * @param message Message to display on error.
      */
    def assert(expression: js.Any): Unit = js.native
    def assert(expression: js.Any, message: String): Unit = js.native
    @JSName("assert")
    var assert_Original: AssertStatic = js.native
    
    var config: Config = js.native
    
    def expect(target: js.Any): Assertion = js.native
    def expect(target: js.Any, message: String): Assertion = js.native
    @JSName("expect")
    var expect_Original: ExpectStatic = js.native
    
    def should(): Should = js.native
    
    /**
      * Provides a way to extend the internals of Chai
      */
    def use(fn: js.Function2[/* chai */ js.Any, /* utils */ js.Any, Unit]): js.Any = js.native
  }
  
  @js.native
  trait Config extends StObject {
    
    var includeStack: Boolean = js.native
  }
  object Config {
    
    @scala.inline
    def apply(includeStack: Boolean): Config = {
      val __obj = js.Dynamic.literal(includeStack = includeStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeStack(value: Boolean): Self = StObject.set(x, "includeStack", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Deep extends StObject {
    
    def equal(value: js.Any): Assertion = js.native
    def equal(value: js.Any, message: String): Assertion = js.native
    @JSName("equal")
    var equal_Original: Equal = js.native
    
    def include(value: String): Assertion = js.native
    def include(value: String, message: String): Assertion = js.native
    def include(value: Double): Assertion = js.native
    def include(value: Double, message: String): Assertion = js.native
    def include(value: Object): Assertion = js.native
    def include(value: Object, message: String): Assertion = js.native
    @JSName("include")
    var include_Original: Include = js.native
    
    def property(name: String): Assertion = js.native
    def property(name: String, value: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def property(name: String, value: js.Any): Assertion = js.native
    def property(name: String, value: js.Any, message: String): Assertion = js.native
    @JSName("property")
    var property_Original: Property = js.native
  }
  
  type Equal = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[String], Assertion]
  
  type ExpectStatic = AssertionStatic
  
  @js.native
  trait Include extends StObject {
    
    def apply(value: String): Assertion = js.native
    def apply(value: String, message: String): Assertion = js.native
    def apply(value: Double): Assertion = js.native
    def apply(value: Double, message: String): Assertion = js.native
    def apply(value: Object): Assertion = js.native
    def apply(value: Object, message: String): Assertion = js.native
    
    def keys(keys: String*): Assertion = js.native
    def keys(keys: js.Array[_]): Assertion = js.native
    @JSName("keys")
    var keys_Original: Keys = js.native
    
    def members(set: js.Array[_]): Assertion = js.native
    def members(set: js.Array[_], message: String): Assertion = js.native
    @JSName("members")
    var members_Original: Members = js.native
  }
  
  type InstanceOf = js.Function2[/* constructor */ Object, /* message */ js.UndefOr[String], Assertion]
  
  @js.native
  trait Keys extends StObject {
    
    def apply(keys: String*): Assertion = js.native
    def apply(keys: js.Array[_]): Assertion = js.native
  }
  
  @js.native
  trait LanguageChains extends StObject {
    
    def and(`type`: String): Assertion = js.native
    def and(`type`: String, message: String): Assertion = js.native
    @JSName("and")
    var and_Original: Assertion = js.native
    
    def at(`type`: String): Assertion = js.native
    def at(`type`: String, message: String): Assertion = js.native
    @JSName("at")
    var at_Original: Assertion = js.native
    
    def be(`type`: String): Assertion = js.native
    def be(`type`: String, message: String): Assertion = js.native
    @JSName("be")
    var be_Original: Assertion = js.native
    
    def been(`type`: String): Assertion = js.native
    def been(`type`: String, message: String): Assertion = js.native
    @JSName("been")
    var been_Original: Assertion = js.native
    
    def has(`type`: String): Assertion = js.native
    def has(`type`: String, message: String): Assertion = js.native
    @JSName("has")
    var has_Original: Assertion = js.native
    
    def have(`type`: String): Assertion = js.native
    def have(`type`: String, message: String): Assertion = js.native
    @JSName("have")
    var have_Original: Assertion = js.native
    
    def is(`type`: String): Assertion = js.native
    def is(`type`: String, message: String): Assertion = js.native
    @JSName("is")
    var is_Original: Assertion = js.native
    
    def of(`type`: String): Assertion = js.native
    def of(`type`: String, message: String): Assertion = js.native
    @JSName("of")
    var of_Original: Assertion = js.native
    
    def same(`type`: String): Assertion = js.native
    def same(`type`: String, message: String): Assertion = js.native
    @JSName("same")
    var same_Original: Assertion = js.native
    
    def that(`type`: String): Assertion = js.native
    def that(`type`: String, message: String): Assertion = js.native
    @JSName("that")
    var that_Original: Assertion = js.native
    
    def to(`type`: String): Assertion = js.native
    def to(`type`: String, message: String): Assertion = js.native
    @JSName("to")
    var to_Original: Assertion = js.native
    
    def which(`type`: String): Assertion = js.native
    def which(`type`: String, message: String): Assertion = js.native
    @JSName("which")
    var which_Original: Assertion = js.native
    
    def `with`(`type`: String): Assertion = js.native
    def `with`(`type`: String, message: String): Assertion = js.native
    @JSName("with")
    var with_Original: Assertion = js.native
  }
  
  @js.native
  trait Length
    extends LanguageChains
       with NumericComparison {
    
    def apply(length: Double): Assertion = js.native
    def apply(length: Double, message: String): Assertion = js.native
  }
  
  type Members = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[String], Assertion]
  
  type NumberComparer = js.Function2[/* value */ Double, /* message */ js.UndefOr[String], Assertion]
  
  @js.native
  trait NumericComparison extends StObject {
    
    def above(value: Double): Assertion = js.native
    def above(value: Double, message: String): Assertion = js.native
    @JSName("above")
    var above_Original: NumberComparer = js.native
    
    def below(value: Double): Assertion = js.native
    def below(value: Double, message: String): Assertion = js.native
    @JSName("below")
    var below_Original: NumberComparer = js.native
    
    def greaterThan(value: Double): Assertion = js.native
    def greaterThan(value: Double, message: String): Assertion = js.native
    @JSName("greaterThan")
    var greaterThan_Original: NumberComparer = js.native
    
    def gt(value: Double): Assertion = js.native
    def gt(value: Double, message: String): Assertion = js.native
    @JSName("gt")
    var gt_Original: NumberComparer = js.native
    
    def gte(value: Double): Assertion = js.native
    def gte(value: Double, message: String): Assertion = js.native
    @JSName("gte")
    var gte_Original: NumberComparer = js.native
    
    def least(value: Double): Assertion = js.native
    def least(value: Double, message: String): Assertion = js.native
    @JSName("least")
    var least_Original: NumberComparer = js.native
    
    def lessThan(value: Double): Assertion = js.native
    def lessThan(value: Double, message: String): Assertion = js.native
    @JSName("lessThan")
    var lessThan_Original: NumberComparer = js.native
    
    def lt(value: Double): Assertion = js.native
    def lt(value: Double, message: String): Assertion = js.native
    @JSName("lt")
    var lt_Original: NumberComparer = js.native
    
    def lte(value: Double): Assertion = js.native
    def lte(value: Double, message: String): Assertion = js.native
    @JSName("lte")
    var lte_Original: NumberComparer = js.native
    
    def most(value: Double): Assertion = js.native
    def most(value: Double, message: String): Assertion = js.native
    @JSName("most")
    var most_Original: NumberComparer = js.native
    
    def within(start: Double, finish: Double): Assertion = js.native
    def within(start: Double, finish: Double, message: String): Assertion = js.native
  }
  
  type OwnProperty = js.Function2[/* name */ String, /* message */ js.UndefOr[String], Assertion]
  
  type Property = js.Function3[
    /* name */ String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[String], 
    Assertion
  ]
  
  @js.native
  trait Should extends ShouldAssertion {
    
    def fail(actual: js.Any, expected: js.Any): Unit = js.native
    def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): Unit = js.native
    def fail(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    def fail(actual: js.Any, expected: js.Any, message: String, operator: String): Unit = js.native
    
    var not: ShouldAssertion = js.native
  }
  
  @js.native
  trait ShouldAssertion extends StObject {
    
    def Throw(actual: js.Function): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function): Unit = js.native
    def Throw(
      actual: js.Function,
      constructor: js.Function,
      expected: js.UndefOr[scala.Nothing],
      message: String
    ): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: RegExp): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: RegExp, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: Error): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: String): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: String, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: RegExp): Unit = js.native
    def Throw(actual: js.Function, constructor: Error, expected: RegExp, message: String): Unit = js.native
    def Throw(actual: js.Function, expected: String): Unit = js.native
    def Throw(actual: js.Function, expected: String, message: String): Unit = js.native
    def Throw(actual: js.Function, expected: RegExp): Unit = js.native
    def Throw(actual: js.Function, expected: RegExp, message: String): Unit = js.native
    @JSName("Throw")
    var Throw_Original: ShouldThrow = js.native
    
    def equal(value1: js.Any, value2: js.Any): Unit = js.native
    def equal(value1: js.Any, value2: js.Any, message: String): Unit = js.native
    
    def exist(value: js.Any): Unit = js.native
    def exist(value: js.Any, message: String): Unit = js.native
    
    def `throw`(actual: js.Function): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function): Unit = js.native
    def `throw`(
      actual: js.Function,
      constructor: js.Function,
      expected: js.UndefOr[scala.Nothing],
      message: String
    ): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: RegExp): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: RegExp, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: String, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: RegExp): Unit = js.native
    def `throw`(actual: js.Function, constructor: Error, expected: RegExp, message: String): Unit = js.native
    def `throw`(actual: js.Function, expected: String): Unit = js.native
    def `throw`(actual: js.Function, expected: String, message: String): Unit = js.native
    def `throw`(actual: js.Function, expected: RegExp): Unit = js.native
    def `throw`(actual: js.Function, expected: RegExp, message: String): Unit = js.native
    @JSName("throw")
    var throw_Original: ShouldThrow = js.native
  }
  
  @js.native
  trait ShouldThrow extends StObject {
    
    def apply(actual: js.Function): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function): Unit = js.native
    def apply(
      actual: js.Function,
      constructor: js.Function,
      expected: js.UndefOr[scala.Nothing],
      message: String
    ): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: RegExp): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: RegExp, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: Error): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: String): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: String, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: RegExp): Unit = js.native
    def apply(actual: js.Function, constructor: Error, expected: RegExp, message: String): Unit = js.native
    def apply(actual: js.Function, expected: String): Unit = js.native
    def apply(actual: js.Function, expected: String, message: String): Unit = js.native
    def apply(actual: js.Function, expected: RegExp): Unit = js.native
    def apply(actual: js.Function, expected: RegExp, message: String): Unit = js.native
  }
  
  @js.native
  trait Throw extends StObject {
    
    def apply(): Assertion = js.native
    def apply(constructor: js.Function): Assertion = js.native
    def apply(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def apply(constructor: js.Function, expected: String): Assertion = js.native
    def apply(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def apply(constructor: js.Function, expected: RegExp): Assertion = js.native
    def apply(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
    def apply(constructor: Error): Assertion = js.native
    def apply(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
    def apply(constructor: Error, expected: String): Assertion = js.native
    def apply(constructor: Error, expected: String, message: String): Assertion = js.native
    def apply(constructor: Error, expected: RegExp): Assertion = js.native
    def apply(constructor: Error, expected: RegExp, message: String): Assertion = js.native
    def apply(expected: String): Assertion = js.native
    def apply(expected: String, message: String): Assertion = js.native
    def apply(expected: RegExp): Assertion = js.native
    def apply(expected: RegExp, message: String): Assertion = js.native
  }
  
  @js.native
  trait TypeComparison extends StObject {
    
    def apply(`type`: String): Assertion = js.native
    def apply(`type`: String, message: String): Assertion = js.native
    
    def instanceOf(constructor: Object): Assertion = js.native
    def instanceOf(constructor: Object, message: String): Assertion = js.native
    @JSName("instanceOf")
    var instanceOf_Original: InstanceOf = js.native
    
    def instanceof(constructor: Object): Assertion = js.native
    def instanceof(constructor: Object, message: String): Assertion = js.native
    @JSName("instanceof")
    var instanceof_Original: InstanceOf = js.native
  }
}
