package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  @js.native
  trait Assert extends StObject {
    
    /**
      * @param expression Expression to test for truthiness.
      * @param message Message to display on error.
      */
    def apply(expression: Any): Unit = js.native
    def apply(expression: Any, message: String): Unit = js.native
    
    def Throw(fn: js.Function): Unit = js.native
    def Throw(fn: js.Function, errType: js.Function): Unit = js.native
    def Throw(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
    def Throw(fn: js.Function, errType: js.Function, regExp: js.RegExp): Unit = js.native
    def Throw(fn: js.Function, msg: String): Unit = js.native
    def Throw(fn: js.Function, regExp: js.RegExp): Unit = js.native
    
    def closeTo(act: Double, exp: Double, delta: Double): Unit = js.native
    def closeTo(act: Double, exp: Double, delta: Double, msg: String): Unit = js.native
    
    def deepEqual(act: Any, exp: Any): Unit = js.native
    def deepEqual(act: Any, exp: Any, msg: String): Unit = js.native
    
    def deepProperty(obj: Object, prop: String): Unit = js.native
    def deepProperty(obj: Object, prop: String, msg: String): Unit = js.native
    
    def deepPropertyNotVal(obj: Object, prop: String, `val`: Any): Unit = js.native
    def deepPropertyNotVal(obj: Object, prop: String, `val`: Any, msg: String): Unit = js.native
    
    def deepPropertyVal(obj: Object, prop: String, `val`: Any): Unit = js.native
    def deepPropertyVal(obj: Object, prop: String, `val`: Any, msg: String): Unit = js.native
    
    def doesNotThrow(fn: js.Function): Unit = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function): Unit = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
    def doesNotThrow(fn: js.Function, errType: js.Function, regExp: js.RegExp): Unit = js.native
    def doesNotThrow(fn: js.Function, msg: String): Unit = js.native
    def doesNotThrow(fn: js.Function, regExp: js.RegExp): Unit = js.native
    
    def equal(act: Any, exp: Any): Unit = js.native
    def equal(act: Any, exp: Any, msg: String): Unit = js.native
    
    def fail(): Unit = js.native
    def fail(actual: Any): Unit = js.native
    def fail(actual: Any, expected: Any): Unit = js.native
    def fail(actual: Any, expected: Any, msg: String): Unit = js.native
    def fail(actual: Any, expected: Any, msg: String, operator: String): Unit = js.native
    def fail(actual: Any, expected: Any, msg: Unit, operator: String): Unit = js.native
    def fail(actual: Any, expected: Unit, msg: String): Unit = js.native
    def fail(actual: Any, expected: Unit, msg: String, operator: String): Unit = js.native
    def fail(actual: Any, expected: Unit, msg: Unit, operator: String): Unit = js.native
    def fail(actual: Unit, expected: Any): Unit = js.native
    def fail(actual: Unit, expected: Any, msg: String): Unit = js.native
    def fail(actual: Unit, expected: Any, msg: String, operator: String): Unit = js.native
    def fail(actual: Unit, expected: Any, msg: Unit, operator: String): Unit = js.native
    def fail(actual: Unit, expected: Unit, msg: String): Unit = js.native
    def fail(actual: Unit, expected: Unit, msg: String, operator: String): Unit = js.native
    def fail(actual: Unit, expected: Unit, msg: Unit, operator: String): Unit = js.native
    
    def ifError(`val`: Any): Unit = js.native
    def ifError(`val`: Any, msg: String): Unit = js.native
    
    def include(exp: String, inc: Any): Unit = js.native
    def include(exp: String, inc: Any, msg: String): Unit = js.native
    def include(exp: js.Array[Any], inc: Any): Unit = js.native
    def include(exp: js.Array[Any], inc: Any, msg: String): Unit = js.native
    
    def includeMembers(set1: js.Array[Any], set2: js.Array[Any]): Unit = js.native
    def includeMembers(set1: js.Array[Any], set2: js.Array[Any], msg: String): Unit = js.native
    
    def instanceOf(`val`: Any, `type`: js.Function): Unit = js.native
    def instanceOf(`val`: Any, `type`: js.Function, msg: String): Unit = js.native
    
    def isArray(`val`: Any): Unit = js.native
    def isArray(`val`: Any, msg: String): Unit = js.native
    
    def isBoolean(`val`: Any): Unit = js.native
    def isBoolean(`val`: Any, msg: String): Unit = js.native
    
    def isDefined(`val`: Any): Unit = js.native
    def isDefined(`val`: Any, msg: String): Unit = js.native
    
    def isFalse(`val`: Any): Unit = js.native
    def isFalse(`val`: Any, msg: String): Unit = js.native
    
    def isFunction(`val`: Any): Unit = js.native
    def isFunction(`val`: Any, msg: String): Unit = js.native
    
    def isNotArray(`val`: Any): Unit = js.native
    def isNotArray(`val`: Any, msg: String): Unit = js.native
    
    def isNotBoolean(`val`: Any): Unit = js.native
    def isNotBoolean(`val`: Any, msg: String): Unit = js.native
    
    def isNotFunction(`val`: Any): Unit = js.native
    def isNotFunction(`val`: Any, msg: String): Unit = js.native
    
    def isNotNull(`val`: Any): Unit = js.native
    def isNotNull(`val`: Any, msg: String): Unit = js.native
    
    def isNotNumber(`val`: Any): Unit = js.native
    def isNotNumber(`val`: Any, msg: String): Unit = js.native
    
    def isNotObject(`val`: Any): Unit = js.native
    def isNotObject(`val`: Any, msg: String): Unit = js.native
    
    def isNotString(`val`: Any): Unit = js.native
    def isNotString(`val`: Any, msg: String): Unit = js.native
    
    def isNull(`val`: Any): Unit = js.native
    def isNull(`val`: Any, msg: String): Unit = js.native
    
    def isNumber(`val`: Any): Unit = js.native
    def isNumber(`val`: Any, msg: String): Unit = js.native
    
    def isObject(`val`: Any): Unit = js.native
    def isObject(`val`: Any, msg: String): Unit = js.native
    
    def isString(`val`: Any): Unit = js.native
    def isString(`val`: Any, msg: String): Unit = js.native
    
    def isTrue(`val`: Any): Unit = js.native
    def isTrue(`val`: Any, msg: String): Unit = js.native
    
    def isUndefined(`val`: Any): Unit = js.native
    def isUndefined(`val`: Any, msg: String): Unit = js.native
    
    def lengthOf(exp: Any, len: Double): Unit = js.native
    def lengthOf(exp: Any, len: Double, msg: String): Unit = js.native
    
    def `match`(exp: Any, re: js.RegExp): Unit = js.native
    def `match`(exp: Any, re: js.RegExp, msg: String): Unit = js.native
    
    def notDeepEqual(act: Any, exp: Any): Unit = js.native
    def notDeepEqual(act: Any, exp: Any, msg: String): Unit = js.native
    
    def notDeepProperty(obj: Object, prop: String): Unit = js.native
    def notDeepProperty(obj: Object, prop: String, msg: String): Unit = js.native
    
    def notEqual(act: Any, exp: Any): Unit = js.native
    def notEqual(act: Any, exp: Any, msg: String): Unit = js.native
    
    def notInclude(exp: String, inc: Any): Unit = js.native
    def notInclude(exp: String, inc: Any, msg: String): Unit = js.native
    def notInclude(exp: js.Array[Any], inc: Any): Unit = js.native
    def notInclude(exp: js.Array[Any], inc: Any, msg: String): Unit = js.native
    
    def notInstanceOf(`val`: Any, `type`: js.Function): Unit = js.native
    def notInstanceOf(`val`: Any, `type`: js.Function, msg: String): Unit = js.native
    
    def notMatch(exp: Any, re: js.RegExp): Unit = js.native
    def notMatch(exp: Any, re: js.RegExp, msg: String): Unit = js.native
    
    def notOk(`val`: Any): Unit = js.native
    def notOk(`val`: Any, msg: String): Unit = js.native
    
    def notProperty(obj: Object, prop: String): Unit = js.native
    def notProperty(obj: Object, prop: String, msg: String): Unit = js.native
    
    def notStrictEqual(act: Any, exp: Any): Unit = js.native
    def notStrictEqual(act: Any, exp: Any, msg: String): Unit = js.native
    
    def notTypeOf(`val`: Any, `type`: String): Unit = js.native
    def notTypeOf(`val`: Any, `type`: String, msg: String): Unit = js.native
    
    def ok(`val`: Any): Unit = js.native
    def ok(`val`: Any, msg: String): Unit = js.native
    
    def operator(`val`: Any, operator: String, val2: Any): Unit = js.native
    def operator(`val`: Any, operator: String, val2: Any, msg: String): Unit = js.native
    
    def property(obj: Object, prop: String): Unit = js.native
    def property(obj: Object, prop: String, msg: String): Unit = js.native
    
    def propertyNotVal(obj: Object, prop: String, `val`: Any): Unit = js.native
    def propertyNotVal(obj: Object, prop: String, `val`: Any, msg: String): Unit = js.native
    
    def propertyVal(obj: Object, prop: String, `val`: Any): Unit = js.native
    def propertyVal(obj: Object, prop: String, `val`: Any, msg: String): Unit = js.native
    
    def sameMembers(set1: js.Array[Any], set2: js.Array[Any]): Unit = js.native
    def sameMembers(set1: js.Array[Any], set2: js.Array[Any], msg: String): Unit = js.native
    
    def strictEqual(act: Any, exp: Any): Unit = js.native
    def strictEqual(act: Any, exp: Any, msg: String): Unit = js.native
    
    //alias frenzy
    def `throw`(fn: js.Function): Unit = js.native
    def `throw`(fn: js.Function, errType: js.Function): Unit = js.native
    def `throw`(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
    def `throw`(fn: js.Function, errType: js.Function, regExp: js.RegExp): Unit = js.native
    def `throw`(fn: js.Function, msg: String): Unit = js.native
    def `throw`(fn: js.Function, regExp: js.RegExp): Unit = js.native
    
    def throws(fn: js.Function): Unit = js.native
    def throws(fn: js.Function, errType: js.Function): Unit = js.native
    def throws(fn: js.Function, errType: js.Function, msg: String): Unit = js.native
    def throws(fn: js.Function, errType: js.Function, regExp: js.RegExp): Unit = js.native
    def throws(fn: js.Function, msg: String): Unit = js.native
    def throws(fn: js.Function, regExp: js.RegExp): Unit = js.native
    
    def typeOf(`val`: Any, `type`: String): Unit = js.native
    def typeOf(`val`: Any, `type`: String, msg: String): Unit = js.native
  }
  
  type AssertStatic = Assert
  
  @js.native
  trait Assertion
    extends StObject
       with LanguageChains
       with NumericComparison
       with TypeComparison {
    
    def Arguments(`type`: String): Assertion = js.native
    def Arguments(`type`: String, message: String): Assertion = js.native
    @JSName("Arguments")
    var Arguments_Original: Assertion = js.native
    
    def Throw(): Assertion = js.native
    def Throw(constructor: js.Error): Assertion = js.native
    def Throw(constructor: js.Error, expected: String): Assertion = js.native
    def Throw(constructor: js.Error, expected: String, message: String): Assertion = js.native
    def Throw(constructor: js.Error, expected: js.RegExp): Assertion = js.native
    def Throw(constructor: js.Error, expected: js.RegExp, message: String): Assertion = js.native
    def Throw(constructor: js.Error, expected: Unit, message: String): Assertion = js.native
    def Throw(constructor: js.Function): Assertion = js.native
    def Throw(constructor: js.Function, expected: String): Assertion = js.native
    def Throw(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def Throw(constructor: js.Function, expected: js.RegExp): Assertion = js.native
    def Throw(constructor: js.Function, expected: js.RegExp, message: String): Assertion = js.native
    def Throw(constructor: js.Function, expected: Unit, message: String): Assertion = js.native
    def Throw(expected: String): Assertion = js.native
    def Throw(expected: String, message: String): Assertion = js.native
    def Throw(expected: js.RegExp): Assertion = js.native
    def Throw(expected: js.RegExp, message: String): Assertion = js.native
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
    
    def eq(value: Any, message: String): Assertion = js.native
    @JSName("eq")
    var eq_Original: Equal = js.native
    
    def eql(value: Any): Assertion = js.native
    def eql(value: Any, message: String): Assertion = js.native
    @JSName("eql")
    var eql_Original: Equal = js.native
    
    def eqls(value: Any): Assertion = js.native
    def eqls(value: Any, message: String): Assertion = js.native
    @JSName("eqls")
    var eqls_Original: Equal = js.native
    
    def equal(value: Any): Assertion = js.native
    def equal(value: Any, message: String): Assertion = js.native
    @JSName("equal")
    var equal_Original: Equal = js.native
    
    def equals(value: Any, message: String): Assertion = js.native
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
    def keys(keys: js.Array[Any]): Assertion = js.native
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
    def `match`(regexp: js.RegExp): Assertion = js.native
    def `match`(regexp: js.RegExp, message: String): Assertion = js.native
    
    def members(set: js.Array[Any]): Assertion = js.native
    def members(set: js.Array[Any], message: String): Assertion = js.native
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
    def property(name: String, value: Any): Assertion = js.native
    def property(name: String, value: Any, message: String): Assertion = js.native
    def property(name: String, value: Unit, message: String): Assertion = js.native
    @JSName("property")
    var property_Original: Property = js.native
    
    def respondTo(method: String): Assertion = js.native
    def respondTo(method: String, message: String): Assertion = js.native
    
    def satisfy(matcher: js.Function): Assertion = js.native
    def satisfy(matcher: js.Function, message: String): Assertion = js.native
    
    def string(string: String): Assertion = js.native
    def string(string: String, message: String): Assertion = js.native
    
    def `throw`(): Assertion = js.native
    def `throw`(constructor: js.Error): Assertion = js.native
    def `throw`(constructor: js.Error, expected: String): Assertion = js.native
    def `throw`(constructor: js.Error, expected: String, message: String): Assertion = js.native
    def `throw`(constructor: js.Error, expected: js.RegExp): Assertion = js.native
    def `throw`(constructor: js.Error, expected: js.RegExp, message: String): Assertion = js.native
    def `throw`(constructor: js.Error, expected: Unit, message: String): Assertion = js.native
    def `throw`(constructor: js.Function): Assertion = js.native
    def `throw`(constructor: js.Function, expected: String): Assertion = js.native
    def `throw`(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def `throw`(constructor: js.Function, expected: js.RegExp): Assertion = js.native
    def `throw`(constructor: js.Function, expected: js.RegExp, message: String): Assertion = js.native
    def `throw`(constructor: js.Function, expected: Unit, message: String): Assertion = js.native
    def `throw`(expected: String): Assertion = js.native
    def `throw`(expected: String, message: String): Assertion = js.native
    def `throw`(expected: js.RegExp): Assertion = js.native
    def `throw`(expected: js.RegExp, message: String): Assertion = js.native
    @JSName("throw")
    var throw_Original: Throw = js.native
    
    def throws(): Assertion = js.native
    def throws(constructor: js.Error): Assertion = js.native
    def throws(constructor: js.Error, expected: String): Assertion = js.native
    def throws(constructor: js.Error, expected: String, message: String): Assertion = js.native
    def throws(constructor: js.Error, expected: js.RegExp): Assertion = js.native
    def throws(constructor: js.Error, expected: js.RegExp, message: String): Assertion = js.native
    def throws(constructor: js.Error, expected: Unit, message: String): Assertion = js.native
    def throws(constructor: js.Function): Assertion = js.native
    def throws(constructor: js.Function, expected: String): Assertion = js.native
    def throws(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def throws(constructor: js.Function, expected: js.RegExp): Assertion = js.native
    def throws(constructor: js.Function, expected: js.RegExp, message: String): Assertion = js.native
    def throws(constructor: js.Function, expected: Unit, message: String): Assertion = js.native
    def throws(expected: String): Assertion = js.native
    def throws(expected: String, message: String): Assertion = js.native
    def throws(expected: js.RegExp): Assertion = js.native
    def throws(expected: js.RegExp, message: String): Assertion = js.native
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
  
  trait AssertionError extends StObject {
    
    var message: String
    
    var name: String
    
    var showDiff: Boolean
    
    var stack: String
  }
  object AssertionError {
    
    inline def apply(message: String, name: String, showDiff: Boolean, stack: String): AssertionError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssertionError] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShowDiff(value: Boolean): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  type AssertionStatic = js.Function2[/* target */ Any, /* message */ js.UndefOr[String], Assertion]
  
  trait ChaiStatic extends StObject {
    
    /**
      * @param expression Expression to test for truthiness.
      * @param message Message to display on error.
      */
    def assert(expression: Any): Unit
    def assert(expression: Any, message: String): Unit
    @JSName("assert")
    var assert_Original: AssertStatic
    
    var config: Config
    
    def expect(target: Any): Assertion
    def expect(target: Any, message: String): Assertion
    @JSName("expect")
    var expect_Original: ExpectStatic
    
    def should(): Should
    
    /**
      * Provides a way to extend the internals of Chai
      */
    def use(fn: js.Function2[/* chai */ Any, /* utils */ Any, Unit]): Any
  }
  object ChaiStatic {
    
    inline def apply(
      assert: AssertStatic,
      config: Config,
      expect: (/* target */ Any, /* message */ js.UndefOr[String]) => Assertion,
      should: () => Should,
      use: js.Function2[/* chai */ Any, /* utils */ Any, Unit] => Any
    ): ChaiStatic = {
      val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], expect = js.Any.fromFunction2(expect), should = js.Any.fromFunction0(should), use = js.Any.fromFunction1(use))
      __obj.asInstanceOf[ChaiStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChaiStatic] (val x: Self) extends AnyVal {
      
      inline def setAssert(value: AssertStatic): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setExpect(value: (/* target */ Any, /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "expect", js.Any.fromFunction2(value))
      
      inline def setShould(value: () => Should): Self = StObject.set(x, "should", js.Any.fromFunction0(value))
      
      inline def setUse(value: js.Function2[/* chai */ Any, /* utils */ Any, Unit] => Any): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    }
  }
  
  trait Config extends StObject {
    
    var includeStack: Boolean
  }
  object Config {
    
    inline def apply(includeStack: Boolean): Config = {
      val __obj = js.Dynamic.literal(includeStack = includeStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setIncludeStack(value: Boolean): Self = StObject.set(x, "includeStack", value.asInstanceOf[js.Any])
    }
  }
  
  trait Deep extends StObject {
    
    def equal(value: Any): Assertion
    def equal(value: Any, message: String): Assertion
    @JSName("equal")
    var equal_Original: Equal
    
    def include(value: String): Assertion
    def include(value: String, message: String): Assertion
    def include(value: Double): Assertion
    def include(value: Double, message: String): Assertion
    def include(value: Object): Assertion
    def include(value: Object, message: String): Assertion
    @JSName("include")
    var include_Original: Include
    
    def property(name: String): Assertion
    def property(name: String, value: Any): Assertion
    def property(name: String, value: Any, message: String): Assertion
    def property(name: String, value: Unit, message: String): Assertion
    @JSName("property")
    var property_Original: Property
  }
  object Deep {
    
    inline def apply(
      equal: (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion,
      include: Include,
      property: (/* name */ String, /* value */ js.UndefOr[Any], /* message */ js.UndefOr[String]) => Assertion
    ): Deep = {
      val __obj = js.Dynamic.literal(equal = js.Any.fromFunction2(equal), include = include.asInstanceOf[js.Any], property = js.Any.fromFunction3(property))
      __obj.asInstanceOf[Deep]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Deep] (val x: Self) extends AnyVal {
      
      inline def setEqual(value: (/* value */ Any, /* message */ js.UndefOr[String]) => Assertion): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      inline def setInclude(value: Include): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setProperty(
        value: (/* name */ String, /* value */ js.UndefOr[Any], /* message */ js.UndefOr[String]) => Assertion
      ): Self = StObject.set(x, "property", js.Any.fromFunction3(value))
    }
  }
  
  type Equal = js.Function2[/* value */ Any, /* message */ js.UndefOr[String], Assertion]
  
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
    def keys(keys: js.Array[Any]): Assertion = js.native
    @JSName("keys")
    var keys_Original: Keys = js.native
    
    def members(set: js.Array[Any]): Assertion = js.native
    def members(set: js.Array[Any], message: String): Assertion = js.native
    @JSName("members")
    var members_Original: Members = js.native
  }
  
  type InstanceOf = js.Function2[/* constructor */ Object, /* message */ js.UndefOr[String], Assertion]
  
  @js.native
  trait Keys extends StObject {
    
    def apply(keys: String*): Assertion = js.native
    def apply(keys: js.Array[Any]): Assertion = js.native
  }
  
  trait LanguageChains extends StObject {
    
    def and(`type`: String): Assertion
    def and(`type`: String, message: String): Assertion
    @JSName("and")
    var and_Original: Assertion
    
    def at(`type`: String): Assertion
    def at(`type`: String, message: String): Assertion
    @JSName("at")
    var at_Original: Assertion
    
    def be(`type`: String): Assertion
    def be(`type`: String, message: String): Assertion
    @JSName("be")
    var be_Original: Assertion
    
    def been(`type`: String): Assertion
    def been(`type`: String, message: String): Assertion
    @JSName("been")
    var been_Original: Assertion
    
    def has(`type`: String): Assertion
    def has(`type`: String, message: String): Assertion
    @JSName("has")
    var has_Original: Assertion
    
    def have(`type`: String): Assertion
    def have(`type`: String, message: String): Assertion
    @JSName("have")
    var have_Original: Assertion
    
    def is(`type`: String): Assertion
    def is(`type`: String, message: String): Assertion
    @JSName("is")
    var is_Original: Assertion
    
    def of(`type`: String): Assertion
    def of(`type`: String, message: String): Assertion
    @JSName("of")
    var of_Original: Assertion
    
    def same(`type`: String): Assertion
    def same(`type`: String, message: String): Assertion
    @JSName("same")
    var same_Original: Assertion
    
    def that(`type`: String): Assertion
    def that(`type`: String, message: String): Assertion
    @JSName("that")
    var that_Original: Assertion
    
    def to(`type`: String): Assertion
    def to(`type`: String, message: String): Assertion
    @JSName("to")
    var to_Original: Assertion
    
    def which(`type`: String): Assertion
    def which(`type`: String, message: String): Assertion
    @JSName("which")
    var which_Original: Assertion
    
    def `with`(`type`: String): Assertion
    def `with`(`type`: String, message: String): Assertion
    @JSName("with")
    var with_Original: Assertion
  }
  object LanguageChains {
    
    inline def apply(
      and: Assertion,
      at: Assertion,
      be: Assertion,
      been: Assertion,
      has: Assertion,
      have: Assertion,
      is: Assertion,
      of: Assertion,
      same: Assertion,
      that: Assertion,
      to: Assertion,
      which: Assertion,
      `with`: Assertion
    ): LanguageChains = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageChains]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LanguageChains] (val x: Self) extends AnyVal {
      
      inline def setAnd(value: Assertion): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAt(value: Assertion): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setBe(value: Assertion): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
      
      inline def setBeen(value: Assertion): Self = StObject.set(x, "been", value.asInstanceOf[js.Any])
      
      inline def setHas(value: Assertion): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHave(value: Assertion): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
      
      inline def setIs(value: Assertion): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setOf(value: Assertion): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
      
      inline def setSame(value: Assertion): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
      
      inline def setThat(value: Assertion): Self = StObject.set(x, "that", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Assertion): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: Assertion): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      inline def setWith(value: Assertion): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Length
    extends StObject
       with LanguageChains
       with NumericComparison {
    
    def apply(length: Double): Assertion = js.native
    def apply(length: Double, message: String): Assertion = js.native
  }
  
  type Members = js.Function2[/* set */ js.Array[Any], /* message */ js.UndefOr[String], Assertion]
  
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
    /* value */ js.UndefOr[Any], 
    /* message */ js.UndefOr[String], 
    Assertion
  ]
  
  @js.native
  trait Should
    extends StObject
       with ShouldAssertion {
    
    def fail(actual: Any, expected: Any): Unit = js.native
    def fail(actual: Any, expected: Any, message: String): Unit = js.native
    def fail(actual: Any, expected: Any, message: String, operator: String): Unit = js.native
    def fail(actual: Any, expected: Any, message: Unit, operator: String): Unit = js.native
    
    var not: ShouldAssertion = js.native
  }
  
  @js.native
  trait ShouldAssertion extends StObject {
    
    def Throw(actual: js.Function): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Error): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Error, expected: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Error, expected: String, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Error, expected: js.RegExp): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Error, expected: js.RegExp, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Error, expected: Unit, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: js.RegExp): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: js.RegExp, message: String): Unit = js.native
    def Throw(actual: js.Function, constructor: js.Function, expected: Unit, message: String): Unit = js.native
    def Throw(actual: js.Function, expected: String): Unit = js.native
    def Throw(actual: js.Function, expected: String, message: String): Unit = js.native
    def Throw(actual: js.Function, expected: js.RegExp): Unit = js.native
    def Throw(actual: js.Function, expected: js.RegExp, message: String): Unit = js.native
    @JSName("Throw")
    var Throw_Original: ShouldThrow = js.native
    
    def equal(value1: Any, value2: Any): Unit = js.native
    def equal(value1: Any, value2: Any, message: String): Unit = js.native
    
    def exist(value: Any): Unit = js.native
    def exist(value: Any, message: String): Unit = js.native
    
    def `throw`(actual: js.Function): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Error): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Error, expected: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Error, expected: String, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Error, expected: js.RegExp): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Error, expected: js.RegExp, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Error, expected: Unit, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: js.RegExp): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: js.RegExp, message: String): Unit = js.native
    def `throw`(actual: js.Function, constructor: js.Function, expected: Unit, message: String): Unit = js.native
    def `throw`(actual: js.Function, expected: String): Unit = js.native
    def `throw`(actual: js.Function, expected: String, message: String): Unit = js.native
    def `throw`(actual: js.Function, expected: js.RegExp): Unit = js.native
    def `throw`(actual: js.Function, expected: js.RegExp, message: String): Unit = js.native
    @JSName("throw")
    var throw_Original: ShouldThrow = js.native
  }
  
  @js.native
  trait ShouldThrow extends StObject {
    
    def apply(actual: js.Function): Unit = js.native
    def apply(actual: js.Function, constructor: js.Error): Unit = js.native
    def apply(actual: js.Function, constructor: js.Error, expected: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Error, expected: String, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Error, expected: js.RegExp): Unit = js.native
    def apply(actual: js.Function, constructor: js.Error, expected: js.RegExp, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Error, expected: Unit, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: js.RegExp): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: js.RegExp, message: String): Unit = js.native
    def apply(actual: js.Function, constructor: js.Function, expected: Unit, message: String): Unit = js.native
    def apply(actual: js.Function, expected: String): Unit = js.native
    def apply(actual: js.Function, expected: String, message: String): Unit = js.native
    def apply(actual: js.Function, expected: js.RegExp): Unit = js.native
    def apply(actual: js.Function, expected: js.RegExp, message: String): Unit = js.native
  }
  
  @js.native
  trait Throw extends StObject {
    
    def apply(): Assertion = js.native
    def apply(constructor: js.Error): Assertion = js.native
    def apply(constructor: js.Error, expected: String): Assertion = js.native
    def apply(constructor: js.Error, expected: String, message: String): Assertion = js.native
    def apply(constructor: js.Error, expected: js.RegExp): Assertion = js.native
    def apply(constructor: js.Error, expected: js.RegExp, message: String): Assertion = js.native
    def apply(constructor: js.Error, expected: Unit, message: String): Assertion = js.native
    def apply(constructor: js.Function): Assertion = js.native
    def apply(constructor: js.Function, expected: String): Assertion = js.native
    def apply(constructor: js.Function, expected: String, message: String): Assertion = js.native
    def apply(constructor: js.Function, expected: js.RegExp): Assertion = js.native
    def apply(constructor: js.Function, expected: js.RegExp, message: String): Assertion = js.native
    def apply(constructor: js.Function, expected: Unit, message: String): Assertion = js.native
    def apply(expected: String): Assertion = js.native
    def apply(expected: String, message: String): Assertion = js.native
    def apply(expected: js.RegExp): Assertion = js.native
    def apply(expected: js.RegExp, message: String): Assertion = js.native
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
