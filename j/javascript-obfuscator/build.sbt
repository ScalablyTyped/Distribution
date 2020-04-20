organization := "org.scalablytyped"
name := "javascript-obfuscator"
version := "0.25.5-658dfb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20200226Z-0a8cf8",
  "org.scalablytyped" %%% "eslint" % "6.8-dt-20200406Z-49daad",
  "org.scalablytyped" %%% "eslint-scope" % "3.7-dt-20180217Z-258335",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200320Z-7314fa",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200225Z-b489dd",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
