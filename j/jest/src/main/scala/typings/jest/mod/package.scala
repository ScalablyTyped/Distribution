package typings.jest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def afterAll: typings.jest.mod.jest.Lifecycle = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("afterAll").asInstanceOf[typings.jest.mod.jest.Lifecycle]
@scala.inline
def afterAll_=(x: typings.jest.mod.jest.Lifecycle): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("afterAll")(x.asInstanceOf[js.Any])

@scala.inline
def afterEach: typings.jest.mod.jest.Lifecycle = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("afterEach").asInstanceOf[typings.jest.mod.jest.Lifecycle]
@scala.inline
def afterEach_=(x: typings.jest.mod.jest.Lifecycle): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(x.asInstanceOf[js.Any])

@scala.inline
def beforeAll: typings.jest.mod.jest.Lifecycle = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("beforeAll").asInstanceOf[typings.jest.mod.jest.Lifecycle]
@scala.inline
def beforeAll_=(x: typings.jest.mod.jest.Lifecycle): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("beforeAll")(x.asInstanceOf[js.Any])

@scala.inline
def beforeEach: typings.jest.mod.jest.Lifecycle = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("beforeEach").asInstanceOf[typings.jest.mod.jest.Lifecycle]
@scala.inline
def beforeEach_=(x: typings.jest.mod.jest.Lifecycle): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(x.asInstanceOf[js.Any])

@scala.inline
def describe: typings.jest.mod.jest.Describe = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("describe").asInstanceOf[typings.jest.mod.jest.Describe]
@scala.inline
def describe_=(x: typings.jest.mod.jest.Describe): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])

@scala.inline
def expect: typings.jest.mod.jest.Expect = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("expect").asInstanceOf[typings.jest.mod.jest.Expect]

/**
  * Fails a test when called within one.
  */
@scala.inline
def fail(): scala.Nothing = typings.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[scala.Nothing]
@scala.inline
def fail(error: js.Any): scala.Nothing = typings.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fail")(error.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]

@scala.inline
def fdescribe: typings.jest.mod.jest.Describe = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("fdescribe").asInstanceOf[typings.jest.mod.jest.Describe]
@scala.inline
def fdescribe_=(x: typings.jest.mod.jest.Describe): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("fdescribe")(x.asInstanceOf[js.Any])

@scala.inline
def fit: typings.jest.mod.jest.It = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("fit").asInstanceOf[typings.jest.mod.jest.It]
@scala.inline
def fit_=(x: typings.jest.mod.jest.It): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("fit")(x.asInstanceOf[js.Any])

@scala.inline
def it: typings.jest.mod.jest.It = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("it").asInstanceOf[typings.jest.mod.jest.It]
@scala.inline
def it_=(x: typings.jest.mod.jest.It): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("it")(x.asInstanceOf[js.Any])

/**
  * If you call the function pending anywhere in the spec body,
  * no matter the expectations, the spec will be marked pending.
  */
@scala.inline
def pending(): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pending")().asInstanceOf[scala.Unit]
@scala.inline
def pending(reason: java.lang.String): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pending")(reason.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

// Jest ships with a copy of Jasmine. They monkey-patch its APIs and divergence/deprecation are expected.
// Relevant parts of Jasmine's API are below so they can be changed and removed over time.
// This file can't reference jasmine.d.ts since the globals aren't compatible.
@scala.inline
def spyOn[T](`object`: T, method: /* keyof T */ java.lang.String): typings.jest.mod.jasmine.Spy = (typings.jest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.jest.mod.jasmine.Spy]

@scala.inline
def test: typings.jest.mod.jest.It = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("test").asInstanceOf[typings.jest.mod.jest.It]
@scala.inline
def test_=(x: typings.jest.mod.jest.It): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])

@scala.inline
def xdescribe: typings.jest.mod.jest.Describe = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("xdescribe").asInstanceOf[typings.jest.mod.jest.Describe]
@scala.inline
def xdescribe_=(x: typings.jest.mod.jest.Describe): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("xdescribe")(x.asInstanceOf[js.Any])

@scala.inline
def xit: typings.jest.mod.jest.It = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("xit").asInstanceOf[typings.jest.mod.jest.It]
@scala.inline
def xit_=(x: typings.jest.mod.jest.It): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("xit")(x.asInstanceOf[js.Any])

@scala.inline
def xtest: typings.jest.mod.jest.It = typings.jest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("xtest").asInstanceOf[typings.jest.mod.jest.It]
@scala.inline
def xtest_=(x: typings.jest.mod.jest.It): scala.Unit = typings.jest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("xtest")(x.asInstanceOf[js.Any])

type ExtractEachCallbackArgs[T /* <: js.Array[js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: jest.anon.1<T>[T extends std.Readonly<[any]> ? 1 : T extends std.Readonly<[any, any]> ? 2 : T extends std.Readonly<[any, any, any]> ? 3 : T extends std.Readonly<[any, any, any, any]> ? 4 : T extends std.Readonly<[any, any, any, any, any]> ? 5 : T extends std.Readonly<[any, any, any, any, any, any]> ? 6 : T extends std.Readonly<[any, any, any, any, any, any, any]> ? 7 : T extends std.Readonly<[any, any, any, any, any, any, any, any]> ? 8 : T extends std.Readonly<[any, any, any, any, any, any, any, any, any]> ? 9 : T extends std.Readonly<[any, any, any, any, any, any, any, any, any, any]> ? 10 : 'fallback'] */ js.Any
