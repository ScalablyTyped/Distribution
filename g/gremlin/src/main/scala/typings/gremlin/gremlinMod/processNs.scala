package typings.gremlin.gremlinMod

import typings.gremlin.Anon_Done
import typings.gremlin.gremlinMod.driverNs.RemoteConnection
import typings.gremlin.gremlinMod.processNs.AnonymousTraversalSource
import typings.gremlin.gremlinMod.processNs.Bytecode
import typings.gremlin.gremlinMod.processNs.EnumValue
import typings.gremlin.gremlinMod.processNs.GraphTraversal
import typings.gremlin.gremlinMod.processNs.GraphTraversalSource
import typings.gremlin.gremlinMod.processNs.Operator
import typings.gremlin.gremlinMod.processNs.P
import typings.gremlin.gremlinMod.processNs.Statics
import typings.gremlin.gremlinMod.processNs.TextP
import typings.gremlin.gremlinMod.processNs.Translator
import typings.gremlin.gremlinMod.processNs.Traversal
import typings.gremlin.gremlinMod.processNs.TraversalStrategies
import typings.gremlin.gremlinMod.processNs.TraversalStrategy
import typings.gremlin.gremlinMod.processNs.Traverser
import typings.gremlin.gremlinMod.processNs.WithOptions
import typings.gremlin.gremlinMod.structureNs.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process")
@js.native
object processNs extends js.Object {
  @js.native
  class AnonymousTraversalSource () extends js.Object {
    def withGraph(graph: Graph): GraphTraversalSource = js.native
    def withRemote(remoteConnection: RemoteConnection): GraphTraversalSource = js.native
  }
  
  @js.native
  class Bytecode () extends js.Object {
    def this(toClone: Bytecode) = this()
    def addSource(name: String): Bytecode = js.native
    def addSource(name: String, values: js.Array[_]): Bytecode = js.native
    def addStep(name: String): Bytecode = js.native
    def addStep(name: String, values: js.Array[_]): Bytecode = js.native
  }
  
  @js.native
  class EnumValue protected () extends js.Object {
    def this(typeName: String, elementName: String) = this()
  }
  
  @js.native
  class GraphTraversal protected () extends Traversal {
    def this(graph: Null, traversalStrategies: Null, bytecode: Bytecode) = this()
    def this(graph: Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def this(graph: Graph, traversalStrategies: Null, bytecode: Bytecode) = this()
    def this(graph: Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def V(args: js.Any*): GraphTraversal = js.native
    def addE(args: js.Any*): GraphTraversal = js.native
    def addV(args: js.Any*): GraphTraversal = js.native
    def aggregate(args: js.Any*): GraphTraversal = js.native
    def and(args: js.Any*): GraphTraversal = js.native
    def as(args: js.Any*): GraphTraversal = js.native
    def barrier(args: js.Any*): GraphTraversal = js.native
    def both(args: js.Any*): GraphTraversal = js.native
    def bothE(args: js.Any*): GraphTraversal = js.native
    def bothV(args: js.Any*): GraphTraversal = js.native
    def branch(args: js.Any*): GraphTraversal = js.native
    def by(args: js.Any*): GraphTraversal = js.native
    def cap(args: js.Any*): GraphTraversal = js.native
    def choose(args: js.Any*): GraphTraversal = js.native
    def coalesce(args: js.Any*): GraphTraversal = js.native
    def coin(args: js.Any*): GraphTraversal = js.native
    def connectedComponent(args: js.Any*): GraphTraversal = js.native
    def constant(args: js.Any*): GraphTraversal = js.native
    def count(args: js.Any*): GraphTraversal = js.native
    def cyclicPath(args: js.Any*): GraphTraversal = js.native
    def dedup(args: js.Any*): GraphTraversal = js.native
    def drop(args: js.Any*): GraphTraversal = js.native
    def emit(args: js.Any*): GraphTraversal = js.native
    def filter(args: js.Any*): GraphTraversal = js.native
    def flatMap(args: js.Any*): GraphTraversal = js.native
    def fold(args: js.Any*): GraphTraversal = js.native
    def from_(args: js.Any*): GraphTraversal = js.native
    def group(args: js.Any*): GraphTraversal = js.native
    def groupCount(args: js.Any*): GraphTraversal = js.native
    def has(args: js.Any*): GraphTraversal = js.native
    def hasId(args: js.Any*): GraphTraversal = js.native
    def hasKey(args: js.Any*): GraphTraversal = js.native
    def hasLabel(args: js.Any*): GraphTraversal = js.native
    def hasNot(args: js.Any*): GraphTraversal = js.native
    def hasValue(args: js.Any*): GraphTraversal = js.native
    def id(args: js.Any*): GraphTraversal = js.native
    def identity(args: js.Any*): GraphTraversal = js.native
    def inE(args: js.Any*): GraphTraversal = js.native
    def inV(args: js.Any*): GraphTraversal = js.native
    def in_(args: js.Any*): GraphTraversal = js.native
    def index(args: js.Any*): GraphTraversal = js.native
    def inject(args: js.Any*): GraphTraversal = js.native
    def is(args: js.Any*): GraphTraversal = js.native
    def key(args: js.Any*): GraphTraversal = js.native
    def label(args: js.Any*): GraphTraversal = js.native
    def limit(args: js.Any*): GraphTraversal = js.native
    def local(args: js.Any*): GraphTraversal = js.native
    def loops(args: js.Any*): GraphTraversal = js.native
    def map(args: js.Any*): GraphTraversal = js.native
    def `match`(args: js.Any*): GraphTraversal = js.native
    def math(args: js.Any*): GraphTraversal = js.native
    def max(args: js.Any*): GraphTraversal = js.native
    def mean(args: js.Any*): GraphTraversal = js.native
    def min(args: js.Any*): GraphTraversal = js.native
    def not(args: js.Any*): GraphTraversal = js.native
    def option(args: js.Any*): GraphTraversal = js.native
    def optional(args: js.Any*): GraphTraversal = js.native
    def or(args: js.Any*): GraphTraversal = js.native
    def order(args: js.Any*): GraphTraversal = js.native
    def otherV(args: js.Any*): GraphTraversal = js.native
    def out(args: js.Any*): GraphTraversal = js.native
    def outE(args: js.Any*): GraphTraversal = js.native
    def outV(args: js.Any*): GraphTraversal = js.native
    def pageRank(args: js.Any*): GraphTraversal = js.native
    def path(args: js.Any*): GraphTraversal = js.native
    def peerPressure(args: js.Any*): GraphTraversal = js.native
    def profile(args: js.Any*): GraphTraversal = js.native
    def program(args: js.Any*): GraphTraversal = js.native
    def project(args: js.Any*): GraphTraversal = js.native
    def properties(args: js.Any*): GraphTraversal = js.native
    def property(args: js.Any*): GraphTraversal = js.native
    def propertyMap(args: js.Any*): GraphTraversal = js.native
    def range(args: js.Any*): GraphTraversal = js.native
    def read(args: js.Any*): GraphTraversal = js.native
    def repeat(args: js.Any*): GraphTraversal = js.native
    def sack(args: js.Any*): GraphTraversal = js.native
    def sample(args: js.Any*): GraphTraversal = js.native
    def select(args: js.Any*): GraphTraversal = js.native
    def shortestPath(args: js.Any*): GraphTraversal = js.native
    def sideEffect(args: js.Any*): GraphTraversal = js.native
    def simplePath(args: js.Any*): GraphTraversal = js.native
    def skip(args: js.Any*): GraphTraversal = js.native
    def store(args: js.Any*): GraphTraversal = js.native
    def subgraph(args: js.Any*): GraphTraversal = js.native
    def sum(args: js.Any*): GraphTraversal = js.native
    def tail(args: js.Any*): GraphTraversal = js.native
    def timeLimit(args: js.Any*): GraphTraversal = js.native
    def times(args: js.Any*): GraphTraversal = js.native
    def to(args: js.Any*): GraphTraversal = js.native
    def toE(args: js.Any*): GraphTraversal = js.native
    def toV(args: js.Any*): GraphTraversal = js.native
    def tree(args: js.Any*): GraphTraversal = js.native
    def unfold(args: js.Any*): GraphTraversal = js.native
    def union(args: js.Any*): GraphTraversal = js.native
    def until(args: js.Any*): GraphTraversal = js.native
    def value(args: js.Any*): GraphTraversal = js.native
    def valueMap(args: js.Any*): GraphTraversal = js.native
    def values(args: js.Any*): GraphTraversal = js.native
    def where(args: js.Any*): GraphTraversal = js.native
    def with_(args: js.Any*): GraphTraversal = js.native
    def write(args: js.Any*): GraphTraversal = js.native
  }
  
  @js.native
  class GraphTraversalSource protected () extends js.Object {
    def this(graph: Null, traversalStrategies: Null, bytecode: Bytecode) = this()
    def this(graph: Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def this(graph: Graph, traversalStrategies: Null, bytecode: Bytecode) = this()
    def this(graph: Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def E(args: js.Any*): GraphTraversal = js.native
    def V(args: js.Any*): GraphTraversal = js.native
    def addE(args: js.Any*): GraphTraversal = js.native
    def addV(args: js.Any*): GraphTraversal = js.native
    def inject(args: js.Any*): GraphTraversal = js.native
    def io(args: js.Any*): GraphTraversal = js.native
    def withBulk(args: js.Any*): GraphTraversalSource = js.native
    def withPath(args: js.Any*): GraphTraversalSource = js.native
    def withRemote(remoteConnection: RemoteConnection): GraphTraversalSource = js.native
    def withSack(args: js.Any*): GraphTraversalSource = js.native
    def withSideEffect(args: js.Any*): GraphTraversalSource = js.native
    def withStrategies(args: js.Any*): GraphTraversalSource = js.native
    def with_(args: js.Any*): GraphTraversalSource = js.native
    def withoutStrategies(args: js.Any*): GraphTraversalSource = js.native
  }
  
  trait Operator extends js.Object {
    var addall: EnumValue
    var and: EnumValue
    var assign: EnumValue
    var div: EnumValue
    var max: EnumValue
    var min: EnumValue
    var minus: EnumValue
    var mult: EnumValue
    var or: EnumValue
    var sum: EnumValue
    var sumlong: EnumValue
  }
  
  @js.native
  class P protected () extends js.Object {
    def this(operator: EnumValue, value: js.Any) = this()
    def this(operator: EnumValue, value: js.Any, other: js.Any) = this()
    def and(): P = js.native
    def and(arg: js.Any): P = js.native
    def or(): P = js.native
    def or(arg: js.Any): P = js.native
  }
  
  trait Statics extends js.Object {
    def V(args: js.Any*): GraphTraversal
    def addE(args: js.Any*): GraphTraversal
    def addV(args: js.Any*): GraphTraversal
    def aggregate(args: js.Any*): GraphTraversal
    def and(args: js.Any*): GraphTraversal
    def as(args: js.Any*): GraphTraversal
    def barrier(args: js.Any*): GraphTraversal
    def both(args: js.Any*): GraphTraversal
    def bothE(args: js.Any*): GraphTraversal
    def bothV(args: js.Any*): GraphTraversal
    def branch(args: js.Any*): GraphTraversal
    def cap(args: js.Any*): GraphTraversal
    def choose(args: js.Any*): GraphTraversal
    def coalesce(args: js.Any*): GraphTraversal
    def coin(args: js.Any*): GraphTraversal
    def constant(args: js.Any*): GraphTraversal
    def count(args: js.Any*): GraphTraversal
    def cyclicPath(args: js.Any*): GraphTraversal
    def dedup(args: js.Any*): GraphTraversal
    def drop(args: js.Any*): GraphTraversal
    def emit(args: js.Any*): GraphTraversal
    def filter(args: js.Any*): GraphTraversal
    def flatMap(args: js.Any*): GraphTraversal
    def fold(args: js.Any*): GraphTraversal
    def group(args: js.Any*): GraphTraversal
    def groupCount(args: js.Any*): GraphTraversal
    def has(args: js.Any*): GraphTraversal
    def hasId(args: js.Any*): GraphTraversal
    def hasKey(args: js.Any*): GraphTraversal
    def hasLabel(args: js.Any*): GraphTraversal
    def hasNot(args: js.Any*): GraphTraversal
    def hasValue(args: js.Any*): GraphTraversal
    def id(args: js.Any*): GraphTraversal
    def identity(args: js.Any*): GraphTraversal
    def inE(args: js.Any*): GraphTraversal
    def inV(args: js.Any*): GraphTraversal
    def in_(args: js.Any*): GraphTraversal
    def index(args: js.Any*): GraphTraversal
    def inject(args: js.Any*): GraphTraversal
    def is(args: js.Any*): GraphTraversal
    def key(args: js.Any*): GraphTraversal
    def label(args: js.Any*): GraphTraversal
    def limit(args: js.Any*): GraphTraversal
    def local(args: js.Any*): GraphTraversal
    def loops(args: js.Any*): GraphTraversal
    def map(args: js.Any*): GraphTraversal
    def `match`(args: js.Any*): GraphTraversal
    def math(args: js.Any*): GraphTraversal
    def max(args: js.Any*): GraphTraversal
    def mean(args: js.Any*): GraphTraversal
    def min(args: js.Any*): GraphTraversal
    def not(args: js.Any*): GraphTraversal
    def optional(args: js.Any*): GraphTraversal
    def or(args: js.Any*): GraphTraversal
    def order(args: js.Any*): GraphTraversal
    def otherV(args: js.Any*): GraphTraversal
    def out(args: js.Any*): GraphTraversal
    def outE(args: js.Any*): GraphTraversal
    def outV(args: js.Any*): GraphTraversal
    def path(args: js.Any*): GraphTraversal
    def project(args: js.Any*): GraphTraversal
    def properties(args: js.Any*): GraphTraversal
    def property(args: js.Any*): GraphTraversal
    def propertyMap(args: js.Any*): GraphTraversal
    def range(args: js.Any*): GraphTraversal
    def repeat(args: js.Any*): GraphTraversal
    def sack(args: js.Any*): GraphTraversal
    def sample(args: js.Any*): GraphTraversal
    def select(args: js.Any*): GraphTraversal
    def sideEffect(args: js.Any*): GraphTraversal
    def simplePath(args: js.Any*): GraphTraversal
    def skip(args: js.Any*): GraphTraversal
    def store(args: js.Any*): GraphTraversal
    def subgraph(args: js.Any*): GraphTraversal
    def sum(args: js.Any*): GraphTraversal
    def tail(args: js.Any*): GraphTraversal
    def timeLimit(args: js.Any*): GraphTraversal
    def times(args: js.Any*): GraphTraversal
    def to(args: js.Any*): GraphTraversal
    def toE(args: js.Any*): GraphTraversal
    def toV(args: js.Any*): GraphTraversal
    def tree(args: js.Any*): GraphTraversal
    def unfold(args: js.Any*): GraphTraversal
    def union(args: js.Any*): GraphTraversal
    def until(args: js.Any*): GraphTraversal
    def value(args: js.Any*): GraphTraversal
    def valueMap(args: js.Any*): GraphTraversal
    def values(args: js.Any*): GraphTraversal
    def where(args: js.Any*): GraphTraversal
  }
  
  @js.native
  class TextP protected () extends js.Object {
    def this(operator: EnumValue, value: String) = this()
    def this(operator: EnumValue, value: String, other: js.Any) = this()
    def and(): P = js.native
    def and(arg: js.Any): P = js.native
    def or(): P = js.native
    def or(arg: js.Any): P = js.native
  }
  
  @js.native
  class Translator protected () extends js.Object {
    def this(traversalSource: AnonymousTraversalSource) = this()
    def this(traversalSource: GraphTraversalSource) = this()
    def getTraversalSource(): Translator = js.native
    def of(traversalSource: AnonymousTraversalSource): Unit = js.native
    def of(traversalSource: GraphTraversalSource): Unit = js.native
    def translate(bytecode: Bytecode): String = js.native
  }
  
  @js.native
  class Traversal protected () extends js.Object {
    def this(graph: Null, traversalStrategies: Null, bytecode: Bytecode) = this()
    def this(graph: Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    def this(graph: Graph, traversalStrategies: Null, bytecode: Bytecode) = this()
    def this(graph: Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
    // [asyncIteratorSymbol: symbol | SymbolConstructor](): Traversal; // How can I implement this?
    def getBytecode(): Bytecode = js.native
    def iterate(): js.Promise[Unit] = js.native
    def next(): js.Promise[Anon_Done] = js.native
    def toList(): js.Promise[js.Array[Traverser]] = js.native
  }
  
  @js.native
  class TraversalSideEffects () extends js.Object
  
  @js.native
  class TraversalStrategies () extends js.Object {
    def this(parent: TraversalStrategies) = this()
    def addStrategy(strategy: TraversalStrategy): Unit = js.native
    def applyStrategies(traversal: Traversal): js.Promise[Traversal] = js.native
  }
  
  @js.native
  class TraversalStrategy () extends js.Object {
    @JSName("apply")
    def apply(traversal: Traversal): js.Promise[Traversal] = js.native
  }
  
  @js.native
  class Traverser protected () extends js.Object {
    def this(`object`: js.Any) = this()
    def this(`object`: js.Any, bulk: Double) = this()
  }
  
  trait WithOptions extends js.Object {
    var all: Double
    var ids: Double
    var indexer: String
    var keys: Double
    var labels: Double
    var list: Double
    var map: Double
    var none: Double
    var tokens: String
    var values: Double
  }
  
  val operator: Operator = js.native
  val statics: Statics = js.native
  val withOptions: WithOptions = js.native
  def traversal(): AnonymousTraversalSource = js.native
  /* static members */
  @js.native
  object AnonymousTraversalSource extends js.Object {
    def traversal(): AnonymousTraversalSource = js.native
  }
  
  /* static members */
  @js.native
  object P extends js.Object {
    def between(args: js.Any*): P = js.native
    def eq(args: js.Any*): P = js.native
    def gt(args: js.Any*): P = js.native
    def gte(args: js.Any*): P = js.native
    def inside(args: js.Any*): P = js.native
    def lt(args: js.Any*): P = js.native
    def lte(args: js.Any*): P = js.native
    def neq(args: js.Any*): P = js.native
    def not(args: js.Any*): P = js.native
    def outside(args: js.Any*): P = js.native
    def test(args: js.Any*): P = js.native
    def within(args: js.Any*): P = js.native
    def without(args: js.Any*): P = js.native
  }
  
  /* static members */
  @js.native
  object TextP extends js.Object {
    def containing(args: js.Any*): TextP = js.native
    def endingWith(args: js.Any*): TextP = js.native
    def notContaining(args: js.Any*): TextP = js.native
    def notEndingWith(args: js.Any*): TextP = js.native
    def notStartingWith(args: js.Any*): TextP = js.native
    def startingWith(args: js.Any*): TextP = js.native
  }
  
  @js.native
  object barrier extends js.Object {
    var normsack: EnumValue = js.native
  }
  
  @js.native
  object cardinality extends js.Object {
    var list: EnumValue = js.native
    var set: EnumValue = js.native
    var single: EnumValue = js.native
  }
  
  @js.native
  object column extends js.Object {
    var keys: EnumValue = js.native
    var values: EnumValue = js.native
  }
  
  @js.native
  object direction extends js.Object {
    var both: EnumValue = js.native
    var in: EnumValue = js.native
    var out: EnumValue = js.native
  }
  
  @js.native
  object graphSONVersion extends js.Object {
    var v1_0: EnumValue = js.native
    var v2_0: EnumValue = js.native
    var v3_0: EnumValue = js.native
  }
  
  @js.native
  object gryoVersion extends js.Object {
    var v1_0: EnumValue = js.native
    var v3_0: EnumValue = js.native
  }
  
  @js.native
  object order extends js.Object {
    var asc: EnumValue = js.native
    var decr: EnumValue = js.native
    var desc: EnumValue = js.native
    var incr: EnumValue = js.native
    var shuffle: EnumValue = js.native
  }
  
  @js.native
  object pick extends js.Object {
    var any: EnumValue = js.native
    var none: EnumValue = js.native
  }
  
  @js.native
  object pop extends js.Object {
    var all: EnumValue = js.native
    var first: EnumValue = js.native
    var last: EnumValue = js.native
    var mixed: EnumValue = js.native
  }
  
  @js.native
  object scope extends js.Object {
    var global: EnumValue = js.native
    var local: EnumValue = js.native
  }
  
  @js.native
  object t extends js.Object {
    var id: EnumValue = js.native
    var key: EnumValue = js.native
    var label: EnumValue = js.native
    var value: EnumValue = js.native
  }
  
}

