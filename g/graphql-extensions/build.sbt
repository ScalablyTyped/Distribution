organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.10.7-99850b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.4.4-b83394",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.5.0-11e239",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.3-916b56",
  "org.scalablytyped" %%% "apollo-server-types" % "0.2.8-645292",
  "org.scalablytyped" %%% "apollo__protobufjs" % "1.0.3-6007d5",
  "org.scalablytyped" %%% "graphql" % "14.5.8-92eff2",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-ae878f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        