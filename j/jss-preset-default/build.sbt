organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.1.1-bd7355"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "jss" % "10.1.1-1dbd9f",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.1.1-fe9647",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.1.1-95c03e",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
