organization := "org.scalablytyped"
name := "javascript-obfuscator"
version := "0.25.2-356381"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-8ede8a",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20200204Z-e27216",
  "org.scalablytyped" %%% "eslint-scope" % "3.7-dt-20180217Z-59e922",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-ca21a3",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20191223Z-c70582",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
