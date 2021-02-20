organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.9.1-1dbe1e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-4f76fe",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-b93e21",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-3f908c",
  "org.scalablytyped" %%% "jss" % "10.5.0-acb538",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-790042",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-a09cce",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
